import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Students } from './student';
import { StudentService } from './student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  public students: Students[];
  public editStudent: Students;

  constructor(private studentService: StudentService){}

  ngOnInit() {
    this.getStudents();
  }

  public getStudents(): void {
    this.studentService.getStudents().subscribe(
      (response: Students[]) => {
        this.students = response;
        console.log(this.students);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }


  //Add student method

  public onAddStudent(addForm: NgForm): void {
    document.getElementById('add-student-form')?.click();
    this.studentService.addStudent(addForm.value).subscribe(
      (response: Students) => {
        console.log(response);
        this.getStudents();
        addForm.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset();
      }
    );
  }

    //Update student method

    public onUpdateStudent(student: Students): void {
      student = this.editStudent;
      this.studentService.updateStudent(student).subscribe(
        (response: Students) => {
          console.log(response);
          this.getStudents(); 
        },
        (error: HttpErrorResponse) => {
          alert(error.message); 
        }
      );
    }

  //Delete student method

  public onDeleteStudent(student: Students): void {
    this.studentService.deleteStudent(student.id).subscribe(
      () => {
        console.log();
        this.getStudents(); 
      },
      (error: HttpErrorResponse) => {
        alert(error.message); 
      }
    );
  }
}
