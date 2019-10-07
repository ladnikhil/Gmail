import { Component, OnInit,Input,Output, EventEmitter } from '@angular/core';
// import { EventEmitter } from 'events';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Output() childdata = new EventEmitter();
@Input() 
datafromparent ='';
  constructor() { }

  ngOnInit() {
    this.childdata.emit('this is data from child');
  }

}
