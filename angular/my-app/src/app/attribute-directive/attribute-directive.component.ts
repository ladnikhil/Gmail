import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent implements OnInit {
  issuccess = true;
  classesarray = ["text-danger","bg-dark","mt-5"];
  constructor() { }

  ngOnInit() {
    setTimeout(()=>{
      this.issuccess = false;
    },1000);
    setInterval(()=>{
      this.issuccess = !this.issuccess;
    },1000)
  }

}
