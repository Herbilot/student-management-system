import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Subjects } from './subject';

@Injectable({
  providedIn: 'root'
})
export class SubjectService {
  private apiServerUrl = 'localhost:8080';


  constructor(private http: HttpClient) {}

  public getSubjects(): Observable<Subjects[]> {
    return this.http.get<Subjects[]>(`${this.apiServerUrl}/subjects`);
  }

  public addSubject(subject: Subjects): Observable<Subjects> {
    return this.http.post<Subjects>(`${this.apiServerUrl}/subjects/add`, subject);
  }

  public updateSubject(subject: Subjects): Observable<Subjects> {
    return this.http.put<Subjects>(`${this.apiServerUrl}/students/update`, subject);
  }

  public deleteSubject(subjectId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/students/delete/${subjectId}`);
  }
}
