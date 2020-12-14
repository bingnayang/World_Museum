import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Museum } from '../museum';
import { MuseumService } from '../services/museum.service';
import { Router } from '@angular/router';
import { Comment } from '../comment';
import { CommentService } from '../services/comment.service';
import { formatDate } from '@angular/common';

@Component({
  selector: 'app-view-detail-museum',
  templateUrl: './view-detail-museum.component.html',
  styleUrls: ['./view-detail-museum.component.css']
})
export class ViewDetailMuseumComponent implements OnInit {
  postDate: Date = new Date();
  temp = formatDate(this.postDate,'MM-dd-yyyy','en-US');

  id: number;
  museum: Museum = new Museum();
  commentInput: Comment = new Comment();
  commentList: Comment[];
  
  constructor(private museumService: MuseumService, private commentService: CommentService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.museumService.getMuseumById(this.id).subscribe(data => {
      this.museum = data;
    },error => console.log(error));

    this.commentService.getCommentById(this.id).subscribe(data => {
      this.commentList = data;
    },error => console.log(error));
  }

  createHours(id: number){
    this.router.navigate(['set-hour',id]);
  }
  createAdmissionRate(id: number){
    this.router.navigate(['set-admission-rate',id]);
  }
  updateHours(id: number){
    this.router.navigate(['set-hour',id]);
  }
  updateRates(id: number){
    this.router.navigate(['set-admission-rate',id]);
  }
  onSubmit(){
    this.saveComment();
  }
  saveComment(){
    this.commentInput.date = this.temp;
    this.commentInput.museum_id = this.id;

    this.commentService.createComment(this.commentInput).subscribe(data => {
      console.log(data);
      this.ngOnInit();
    }, error => console.log(error));
  }
}
