import { Component, OnInit } from '@angular/core';
import { Hour } from '../hour';
import { Router } from '@angular/router';
import { HourService } from '../services/hour.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-set-hour',
  templateUrl: './set-hour.component.html',
  styleUrls: ['./set-hour.component.css']
})
export class SetHourComponent implements OnInit {
  public namesOfDays = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
  hours: Hour[];
  id: number;

  constructor(private hourService: HourService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.hourService.getHoursById(this.id).subscribe(data => {
      this.hours = data;
      console.log(data);

      if (this.hours.length == 0) {
        for (var i = 0; i <= 6; i++) {
          this.hours.push({
            id: this.hours.length + 1,
            museum_id: this.id,
            day: this.namesOfDays[i],
            hour: ''
          });
        }
      }

    }, error => console.log(error));

  }

  goToMuseum() {
    this.router.navigate(['view-detail-museum', this.id]);
  }

  onSubmit() {
    console.log(this.hours);
    this.saveHour();
  }

  saveHour() {
    for (var i = 0; i <= 6; i++) {
      // this.hourService.createHours(this.hours[i]).subscribe(data => {
      //   console.log('saveHour: ' + data);
      // }, error => console.log(error));
      this.hourService.setHours(this.id,this.hours[i]).subscribe(data => {
        console.log('saveHour: ' + data);
      }, error => console.log(error));
    }
    this.goToMuseum();
  }
}