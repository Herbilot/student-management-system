import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Groups } from './group';
import { GroupService } from './group.service';

@Component({
  selector: 'app-group',
  templateUrl: './group.component.html',
  styleUrls: ['./group.component.css']
})
export class GroupComponent implements OnInit {
  
  public groups: Groups[];

  constructor(private groupService: GroupService){}

  ngOnInit() {
    this.getGroups();
  }

  public getGroups():void{

    this.groupService.getGroup().subscribe(

      (response: Groups[]) => {
        this.groups = response;
        console.log(this.groups);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );

  }

   public Colors: Array<{id: number, name:string}> = [
    {id:1, name:'warning'},
    {id:2, name:'primary'},
    {id:3, name:'danger'},
    {id:4, name:'success'}
   ];
   



}

