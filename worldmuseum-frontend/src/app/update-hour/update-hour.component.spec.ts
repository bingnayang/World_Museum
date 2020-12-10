import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateHourComponent } from './update-hour.component';

describe('UpdateHourComponent', () => {
  let component: UpdateHourComponent;
  let fixture: ComponentFixture<UpdateHourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateHourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateHourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
