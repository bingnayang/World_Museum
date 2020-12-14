import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Admission } from '../admission';

@Injectable({
  providedIn: 'root'
})
export class AdmissionService {
  private baseURL = "http://localhost:8080/api/rates";

  constructor(private httpClient: HttpClient) { }

  createAdmission(rate: Admission): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,rate);
  }

  getRatesById(id: number): Observable<Admission[]>{
    return this.httpClient.get<Admission[]>(`${this.baseURL}/${id}`);
  }
  
  updateRates(rate: Admission): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}`,rate)
  }
}
