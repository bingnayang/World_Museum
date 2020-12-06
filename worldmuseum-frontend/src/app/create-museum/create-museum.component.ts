import { Component, OnInit } from '@angular/core';
import { Museum } from '../museum';

@Component({
  selector: 'app-create-museum',
  templateUrl: './create-museum.component.html',
  styleUrls: ['./create-museum.component.css']
})
export class CreateMuseumComponent implements OnInit {
  museum: Museum = new Museum();

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.museum)
  }

}
