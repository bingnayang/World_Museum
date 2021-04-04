import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ImageService {
  private baseURL = "http://localhost:8080/api/images";

  constructor(private httpClient: HttpClient) { }
}
