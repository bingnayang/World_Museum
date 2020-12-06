import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Museum } from '../museum';
import { MuseumService } from '../museum.service';

@Component({
  selector: 'app-create-museum',
  templateUrl: './create-museum.component.html',
  styleUrls: ['./create-museum.component.css']
})
export class CreateMuseumComponent implements OnInit {
  museum: Museum = new Museum();

  // Inject museumService and router
  constructor(private museumService: MuseumService, private router: Router) { }

  ngOnInit(): void {
  }

  goToMuseumList(){
    this.router.navigate(['/museums']);
  }

  onSubmit(){
    console.log(this.museum)
    this.saveMuseum();
  }

  saveMuseum(){
    this.museumService.createMuseum(this.museum).subscribe(data => {
      console.log(data);
      this.goToMuseumList();
    }, error => console.log(error));
  }
}
