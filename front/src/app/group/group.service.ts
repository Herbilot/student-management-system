import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Groups } from './group';

@Injectable({
  providedIn: 'root'
})
export class GroupService {
  private apiServerUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  public getGroup(): Observable<Groups[]>{
    return this.http.get<Groups[]>(`${this.apiServerUrl}/groups`);
  }
}
