import { Component, OnInit } from '@angular/core';
import { GLOBAL } from '../app-config';
import { MembersService } from 'src/app/services/members.service';
import { Member } from 'src/Models/Member';

@Component({
  selector: 'app-member-list',
  templateUrl: './member-list.component.html',
  styleUrls: ['./member-list.component.css']
})
export class MemberListComponent implements OnInit {
  dataSource : Member[]=GLOBAL._DB.members;
  displayedColumns: string[] = ['id', 'cin', 'name', 'type', 'cv', 'createdDate','actions'];
  //clickedRows = new Set<PeriodicElement>();

  constructor(private Ms :MembersService) { //injection de service
    this.dataSource=this.Ms.tab; //exploitation de service
   }
  // onDelete(): void{

  // }

  ngOnInit(): void {
  }

}
