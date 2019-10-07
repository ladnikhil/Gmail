import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-cars-details',
  templateUrl: './cars-details.component.html',
  styleUrls: ['./cars-details.component.css']
})
export class CarsDetailsComponent implements OnInit {

  @Input() cardetails:any = '';
  constructor() { }

  ngOnInit() {
  }

}
