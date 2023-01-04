import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Subjects } from './subject';
import { SubjectService } from './subject.service';

@Component({
  selector: 'app-subject',
  templateUrl: './subject.component.html',
  styleUrls: ['./subject.component.css']
})
export class SubjectComponent implements OnInit {

  public subjects: Subjects[];

  constructor(private subjectService: SubjectService){}

  ngOnInit() {
    this.getSubjects();
  }

  public getSubjects(): void {
    this.subjectService.getSubjects().subscribe(
      (response: Subjects[]) => {
        this.subjects = response;
        console.log(this.subjects);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }


  //Add student method

  public onAddSubject(addForm: NgForm): void {
    document.getElementById('add-subject-form')?.click();
    this.subjectService.addSubject(addForm.value).subscribe(
      (response: Subjects) => {
        console.log(response);
        this.getSubjects();
        addForm.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset();
      }
    );
  }

}
