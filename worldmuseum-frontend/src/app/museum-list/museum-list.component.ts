import { Component, OnInit } from '@angular/core';
import { Museum } from '../museum';

@Component({
  selector: 'app-museum-list',
  templateUrl: './museum-list.component.html',
  styleUrls: ['./museum-list.component.css']
})
export class MuseumListComponent implements OnInit {
  // Create a property called museum
  museums: Museum[];

  constructor() { }

  ngOnInit(): void {
    // Use temp data for testing 
    this.museums =[
      {
        "id":1,
        "name":"The Philadelphia Museum ",
        "address":"2600 Benjamin Franklin Pkwy, Philadelphia, PA 19130",
        "country":"USA",
        "website":"https://www.philamuseum.org/",
        "image_link":"https://assets.philamuseum.org/public/2019-01/visit_mainbuilding2x.jpg"
      },
      {
        "id":2,
        "name":"The Philadelphia Museum ",
        "address":"2600 Benjamin Franklin Pkwy, Philadelphia, PA 19130",
        "country":"USA",
        "website":"https://www.philamuseum.org/",
        "image_link":"https://www.centralpark.com/downloads/8562/download/metropolitan-museum-of-art.jpg?cb=e107c33e892b68ceca830f1fc85a6719&w=640"
      },
      {
        "id":3,
        "name":"The Philadelphia Museum ",
        "address":"2600 Benjamin Franklin Pkwy, Philadelphia, PA 19130",
        "country":"USA",
        "website":"https://www.philamuseum.org/",
        "image_link":"https://assets.philamuseum.org/public/2019-01/visit_mainbuilding2x.jpg"
      },
      {
        "id":4,
        "name":"The Philadelphia Museum ",
        "address":"2600 Benjamin Franklin Pkwy, Philadelphia, PA 19130",
        "country":"USA",
        "website":"https://www.philamuseum.org/",
        "image_link":"https://www.centralpark.com/downloads/8562/download/metropolitan-museum-of-art.jpg?cb=e107c33e892b68ceca830f1fc85a6719&w=640"
      }
    ]
  }

}
