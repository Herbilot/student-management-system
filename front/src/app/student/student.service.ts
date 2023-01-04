import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { Students } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private apiServerUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  public getStudents(): Observable<Students[]> {
    return this.http.get<Students[]>(`${this.apiServerUrl}/students`);
  }

  public addStudent(student: Students): Observable<Students> {
    return this.http.post<Students>(`${this.apiServerUrl}/students/add`, student);
  }

  public updateStudent(student: Students): Observable<Students> {
    return this.http.put<Students>(`${this.apiServerUrl}/students/update`, student);
  }

  public deleteStudent(studentId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/students/delete/${studentId}`);
  }
}
