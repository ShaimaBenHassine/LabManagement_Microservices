import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators, } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Member } from 'src/Models/Member';
import { MembersService } from '../services/members.service';

@Component({
  selector: 'app-member-form',
  templateUrl: './member-form.component.html',
  styleUrls: ['./member-form.component.css']
})
export class MemberFormComponent implements OnInit {
  form:any;
  item1 : any;
  constructor(private memberservice : MembersService, private router : Router, private activateRoute : ActivatedRoute) { }
  currentId : any;
  ngOnInit(): void {
    //route active
    this.currentId=this.activateRoute.snapshot.params.id;
    if(!!this.currentId)
    // !! truly
    {////// je suis dans edit
    //getelementbyid dans le service
      this.memberservice.getMemberById(this.currentId).then
      ((item) => { this.item1=item; this.initForm(this.item1); })
      //////
    }
    else //// je suis dans add
    {this.initForm(null);}
  }
  initForm(item : any):void {
    this.form=new FormGroup(
      {
        cin: new FormControl(item?.cin,[Validators.required]),
        name: new FormControl(item?.name,[Validators.required]),
        cv: new FormControl(item?.cv,[]),
        type: new FormControl(item?.type,[Validators.required])
      }
    )

  }
  onSub ():void
  {
    console.log(this.form.value);
    //const memberToSave=this.form.value;
    const objectToSubmit : Member={...this.item1, ...this.form.value};
    this.memberservice.saveMember(objectToSubmit).then
    (()=>{this.router.navigate(['./members'])});
    //then :action aprés executer le service
  }
}
