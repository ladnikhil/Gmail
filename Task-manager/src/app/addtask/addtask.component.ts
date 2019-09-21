import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  constructor() { }

  task:any[]=[];
  
  senddata(data : NgForm){
   this.task.push(data);
  console.log(this.task);
  data.value.reset();
  }

  delete(i){
    this.task.splice( i ,1,);
 }

 j:number =0;
 upd(i){
 this.j=i;
 }

 
 update(data){
   this.task[this.j]=data;
 }

  ngOnInit() {
  }

}
