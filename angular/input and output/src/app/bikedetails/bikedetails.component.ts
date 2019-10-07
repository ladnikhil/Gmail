import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bikedetails',
  templateUrl: './bikedetails.component.html',
  styleUrls: ['./bikedetails.component.css']
})
export class BikedetailsComponent implements OnInit {

  @Input() bikedetail:any = '';
  constructor() { }

  ngOnInit() {
  }

}
