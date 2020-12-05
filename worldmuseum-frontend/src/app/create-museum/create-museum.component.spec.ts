import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateMuseumComponent } from './create-museum.component';

describe('CreateMuseumComponent', () => {
  let component: CreateMuseumComponent;
  let fixture: ComponentFixture<CreateMuseumComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateMuseumComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateMuseumComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
