import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Museum } from '../museum';
import { MuseumService } from '../services/museum.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-detail-museum',
  templateUrl: './view-detail-museum.component.html',
  styleUrls: ['./view-detail-museum.component.css']
})
export class ViewDetailMuseumComponent implements OnInit {

  id: number;
  museum: Museum = new Museum();
  
  constructor(private museumService: MuseumService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.museumService.getMuseumById(this.id).subscribe(data => {
      this.museum = data;
      console.log(this.museum);
    },error => console.log(error));
  }

  createHours(id: number){
    console.log('Museum Id:'+id)
    this.router.navigate(['set-hour',id]);
  }
  updateHours(id: number){
    this.router.navigate(['set-hour',id]);
  }
}
