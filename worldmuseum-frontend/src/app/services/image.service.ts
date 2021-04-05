import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Image } from '../image';
@Injectable({
  providedIn: 'root'
})
export class ImageService {
  private baseURL = "http://localhost:8080/api/images";

  constructor(private httpClient: HttpClient) { }

  getImageByMuseumId(id: number): Observable<Image[]>{
    return this.httpClient.get<Image[]>(`${this.baseURL}/${id}`);
  }
  uploadImage(image: Image){
    return this.httpClient.post<Image>(`${this.baseURL}`,image);
  }
}
