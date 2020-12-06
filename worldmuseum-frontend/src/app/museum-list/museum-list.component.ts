import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Museum } from '../museum';
import { MuseumService } from '../museum.service';
 
@Component({
  selector: 'app-museum-list',
  templateUrl: './museum-list.component.html',
  styleUrls: ['./museum-list.component.css']
})
export class MuseumListComponent implements OnInit {
  // Create a property called museum
  museums: Museum[];

  constructor(private museumService: MuseumService, private router: Router) { }

  ngOnInit(): void {
    this.getMuseumList();
  }

  private getMuseumList(){
    // Subscribe will called once it get the data 
    // To the subscribe method, we are going to handle the response of the rest api
    // Assign a response data to the museum property
    this.museumService.getMuseumList().subscribe(data => {
      this.museums = data;
    })
  }

  newMuseum(){
    this.router.navigate(['/create-museum']);
  }
}
