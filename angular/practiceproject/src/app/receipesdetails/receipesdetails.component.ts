import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-receipesdetails',
  templateUrl: './receipesdetails.component.html',
  styleUrls: ['./receipesdetails.component.css']
})
export class ReceipesdetailsComponent implements OnInit {

  constructor() { }

  @Input() receipesdetails: any = '';

  ngOnInit() {
  }

}
