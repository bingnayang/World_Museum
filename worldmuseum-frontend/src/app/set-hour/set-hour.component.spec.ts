import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SetHourComponent } from './set-hour.component';

describe('SetHourComponent', () => {
  let component: SetHourComponent;
  let fixture: ComponentFixture<SetHourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetHourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SetHourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
