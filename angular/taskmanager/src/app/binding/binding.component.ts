import { Component, OnInit } from '@angular/core';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  click(){
    alert("welcome yo our page");
  }


  imgurl = "https://cdn.pixabay.com/photo/2017/11/04/11/25/fog-2917232__340.jpg";

  isapplicable = true;
  style = "green";
  red = "blue";
  ngOnInit() {

    setTimeout(()=>{
      this.isapplicable = false;
    },2000);

    setInterval(()=>{
      this.isapplicable = !this.isapplicable;
    },2000);
  }

}
