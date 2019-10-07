import { Component, OnInit } from '@angular/core';
import {  NgForm } from '@angular/forms';
import { DataServicesService } from '../data-services.service';

@Component({
  selector: 'app-viewalltask',
  templateUrl: './viewalltask.component.html',
  styleUrls: ['./viewalltask.component.css']
})
export class ViewalltaskComponent implements OnInit {

  viewtask = [];
  constructor(private dataservice : DataServicesService) { 
    this.viewtask = dataservice.taskdata;
  }

  delete(i){
    console.log(i);
    this.viewtask.splice(i,1,);
    
  }

  
 j:number =0;
 
 upd(i){
 this.j=i;
 }

 
 sendupdate(data){
   this.viewtask[this.j]=data;
 }

  ngOnInit() {}
 
  

}
