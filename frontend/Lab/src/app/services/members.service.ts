//pour vérifier que le service est injectable
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Member } from 'src/Models/Member';
import { GLOBAL } from '../app-config';

@Injectable({
  providedIn: 'root'
})
export class MembersService {
  constructor(private httpClient : HttpClient ) {}
  saveMember (member : Member): Promise<Member>
  {
  //promise : thread pour écouter et refleter l'etat de back en temps réel
  //this.httpClient.post<Member>('linkToRestAPI',member).toPromise();
  const memberToSave = {...member,}
  memberToSave.id = member.id?? Math.ceil(Math.random()*10000).toString();
  memberToSave.createdDate = member.createdDate?? new Date().toISOString();
  this.tab=[memberToSave,...this.tab.filter(item => item.id!==memberToSave.id)];
  return new Promise(resolve => resolve(memberToSave));
  //resolve : bloc try 
  }
  getMemberById(id: string): Promise<Member>
  // dans les méthodes de services qui retoure hhtpclient il faut ajouter promise comme type de retour
  {
   // this.httpClient.get<Member>('linkToRestAPI').toPromise();
   return new Promise(resolve => resolve (this.tab.filter(item=> item.id===id)[0]??null));
  }

  // removeById (id : string) : Promise<Member>{
  //   return new Promise (resolve => resolve (this.tab=this.tab.filter(item=>item.id !== id));
    
  // }
  tab=GLOBAL._DB.members;
}
