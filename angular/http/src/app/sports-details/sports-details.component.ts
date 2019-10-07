import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-sports-details',
  templateUrl: './sports-details.component.html',
  styleUrls: ['./sports-details.component.css']
})
export class SportsDetailsComponent implements OnInit {


  @Input() sportsdetails: any = '';
  constructor() { }

  ngOnInit() {
  }

}
