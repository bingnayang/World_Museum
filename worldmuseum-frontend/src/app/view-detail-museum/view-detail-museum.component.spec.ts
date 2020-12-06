import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewDetailMuseumComponent } from './view-detail-museum.component';

describe('ViewDetailMuseumComponent', () => {
  let component: ViewDetailMuseumComponent;
  let fixture: ComponentFixture<ViewDetailMuseumComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewDetailMuseumComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewDetailMuseumComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
