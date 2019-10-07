import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReceipesdetailsComponent } from './receipesdetails.component';

describe('ReceipesdetailsComponent', () => {
  let component: ReceipesdetailsComponent;
  let fixture: ComponentFixture<ReceipesdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReceipesdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReceipesdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
