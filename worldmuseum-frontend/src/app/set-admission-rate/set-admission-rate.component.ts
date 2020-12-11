import { Component, OnInit } from '@angular/core';
import { Admission } from '../admission';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-set-admission-rate',
  templateUrl: './set-admission-rate.component.html',
  styleUrls: ['./set-admission-rate.component.css']
})
export class SetAdmissionRateComponent implements OnInit {
  public typeOfAdmission = ['Adults','Senior','Student','Youths','Members','Member Guests'];
  admission: Admission[] = [];
  id: number;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    for(var i=0; i < this.typeOfAdmission.length ;i++){
      this.admission.push({
        id: this.admission.length+1,
        museum_id: this.id,
        guest: this.typeOfAdmission[i],
        price: ''
      });
    }

  }

  onSubmit(){
    console.log(this.admission);
  }
}
