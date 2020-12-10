import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Hour } from './hour';

@Injectable({
  providedIn: 'root'
})
export class HourService {
  private baseURL = "http://localhost:8080/api/hours";

  constructor(private httpClient: HttpClient) { }

  createHours(hour: Hour): Observable<Object>{
    console.log('createHour: '+hour);
    return this.httpClient.post(`${this.baseURL}`,hour);
  }
}
