import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-receipes-details',
  templateUrl: './receipes-details.component.html',
  styleUrls: ['./receipes-details.component.css']
})
export class ReceipesDetailsComponent implements OnInit {

  @Input() receipedetails: any = '';
  constructor() { }

  ngOnInit() {
  }

}
