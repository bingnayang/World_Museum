import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SetAdmissionRateComponent } from './set-admission-rate.component';

describe('SetAdmissionRateComponent', () => {
  let component: SetAdmissionRateComponent;
  let fixture: ComponentFixture<SetAdmissionRateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetAdmissionRateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SetAdmissionRateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
