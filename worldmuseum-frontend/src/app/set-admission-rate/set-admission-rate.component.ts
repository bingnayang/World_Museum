import { Component, OnInit } from '@angular/core';
import { Admission } from '../admission';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';
import { AdmissionService } from '../services/admission.service';

@Component({
  selector: 'app-set-admission-rate',
  templateUrl: './set-admission-rate.component.html',
  styleUrls: ['./set-admission-rate.component.css']
})
export class SetAdmissionRateComponent implements OnInit {
  public typeOfAdmission = ['Adults', 'Senior', 'Student', 'Youths', 'Members', 'Member Guests'];
  admission: Admission[];
  id: number;
  updateCheck: boolean;

  constructor(private admissionService: AdmissionService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.admissionService.getRatesById(this.id).subscribe(data => {
      this.admission = data;

      if (this.admission.length == 0) {
        for (var i = 0; i < this.typeOfAdmission.length; i++) {
          this.admission.push({
            id: this.admission.length + 1,
            museum_id: this.id,
            guest: this.typeOfAdmission[i],
            price: ''
          });
        }
        this.updateCheck = false;
      }else{
        this.updateCheck = true;
      }
    }, error => console.log(error));
  }

  goToMuseum() {
    this.router.navigate(['view-detail-museum', this.id]);
  }

  onSubmit() {
    if (this.updateCheck) {
      console.log("update rates method")
      this.updateRate();
    } else {
      console.log("create rates method")
      this.saveRate();
    }
  }

  saveRate() {
    for (var i = 0; i < this.typeOfAdmission.length; i++) {
      this.admissionService.createAdmission(this.admission[i]).subscribe(data => {
        console.log(data);
      }, error => console.log(error));
    }
    this.goToMuseum();
  }

  updateRate() {
    for (var i = 0; i < this.typeOfAdmission.length; i++) {
      this.admissionService.updateRates(this.admission[i]).subscribe(data => {
        console.log(data);
      }, error => console.log(error));
    }
    this.goToMuseum();
  }
}
