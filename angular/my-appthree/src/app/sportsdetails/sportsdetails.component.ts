import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-sportsdetails',
  templateUrl: './sportsdetails.component.html',
  styleUrls: ['./sportsdetails.component.css']
})
export class SportsdetailsComponent implements OnInit {

  @Input() sportsdetails: any = '';

  constructor() { }

  ngOnInit() {
  }

}
