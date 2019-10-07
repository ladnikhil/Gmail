import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent  {

  redcolor = true;
  name = 'Nikhil';
  textClasses = 'bg-success text-white';
  paragraghstyles = true;
  padding = '50px';
  columnspan = '2px';
  imgURL = 'https://cdn.pixabay.com/photo/2019/07/23/08/42/nature-4356963__340.jpg';

  constructor() {
    setTimeout(()=> {
      // this.redcolor = false;
      this.paragraghstyles = false;
    },5000)
   }


}
