import { Component, OnInit } from '@angular/core';
import { Hour } from '../hour';

@Component({
  selector: 'app-set-hour',
  templateUrl: './set-hour.component.html',
  styleUrls: ['./set-hour.component.css']
})
export class SetHourComponent implements OnInit {
  public namesOfDays = ['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'];
  hours: Hour[] = [];

  constructor() { 
    for(var i=0; i <= 6;i++){
      this.hours.push({
        id: this.hours.length+1,
        day: this.namesOfDays[i],
        hour: ''
      });
    }
  }

  ngOnInit(): void {
  }

  onSubmit() {
    console.log(this.hours);
  }
  
}
