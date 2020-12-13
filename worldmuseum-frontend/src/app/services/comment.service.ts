import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Comment } from '../comment';
@Injectable({
  providedIn: 'root'
})
export class CommentService {
  private baseURL = "http://localhost:8080/api/comments";

  constructor(private httpClient: HttpClient) { }

  getCommentById(id: number): Observable<Comment[]>{
    return this.httpClient.get<Comment[]>(`${this.baseURL}/${id}`);
  }
}
