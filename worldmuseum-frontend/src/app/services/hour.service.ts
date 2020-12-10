import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Hour } from '../hour';

@Injectable({
  providedIn: 'root'
})
export class HourService {
  private baseURL = "http://localhost:8080/api/hours";

  constructor(private httpClient: HttpClient) { }

  createHours(hour: Hour): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,hour);
  }
  // getHoursById(id: number): Observable<Hour[]>{
  //   return this.httpClient.get<Hour[]>(`${this.baseURL}/${id}`);
  // }
  // saveUpdateHours(id: number, hours: Hour[]): Observable<Object>{
  //   return this.httpClient.put(`${this.baseURL}`,hours)
  // }
}
