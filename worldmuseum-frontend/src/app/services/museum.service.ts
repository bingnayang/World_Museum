import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Museum } from '../museum';
@Injectable({
  providedIn: 'root'
})
export class MuseumService {
  private baseURL = "http://localhost:8080/api/museums";

  constructor(private httpClient: HttpClient) { }

  getMuseumList(): Observable<Museum[]>{
    return this.httpClient.get<Museum[]>(`${this.baseURL}`);
  }

  createMuseum(museum: Museum): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,museum);
  }

  getMuseumById(id: number): Observable<Museum>{
    return this.httpClient.get<Museum>(`${this.baseURL}/${id}`);
  }
}

