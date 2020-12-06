import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Museum } from '../museum';
import { MuseumService } from '../museum.service';

@Component({
  selector: 'app-view-detail-museum',
  templateUrl: './view-detail-museum.component.html',
  styleUrls: ['./view-detail-museum.component.css']
})
export class ViewDetailMuseumComponent implements OnInit {

  id: number;
  museum: Museum = new Museum();

  constructor(private museumService: MuseumService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.museumService.getMuseumById(this.id).subscribe(data => {
      this.museum = data;
    },error => console.log(error));
  }



}
