import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Museum } from '../museum';
import { MuseumService } from '../services/museum.service';
import { Router } from '@angular/router';
import { Comment } from '../comment';
import { CommentService } from '../services/comment.service';
import { formatDate } from '@angular/common';
import { Image } from '../image';
import { ImageService } from '../services/image.service';

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

  imageURL: Image = new Image();
  imageList: Image[];
  
  constructor(private museumService: MuseumService,private imageService: ImageService, private commentService: CommentService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.museumService.getMuseumById(this.id).subscribe(data => {
      this.museum = data;
    },error => console.log(error));

    this.commentService.getCommentById(this.id).subscribe(data => {
      this.commentList = data;
    },error => console.log(error));
  }
  // Create Hour and Update Hour
  createHours(id: number){
    this.router.navigate(['set-hour',id]);
  }
  updateHours(id: number){
    this.router.navigate(['set-hour',id]);
  }
  // Create Rate and update Rate
  createAdmissionRate(id: number){
    this.router.navigate(['set-admission-rate',id]);
  }
  updateRates(id: number){
    this.router.navigate(['set-admission-rate',id]);
  }
  // Add Comment
  onCommentSubmit(){
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
  // Save Image
  onImageSubmit(){
    this.saveImage();
  }
  saveImage(){
    this.imageURL.date = this.temp;
    // Upload the image url to database 
    this.imageService.uploadImage(this.imageURL).subscribe(data => {
      console.log(data);
      this.ngOnInit();
    }, error => console.log(error));
  }
}
