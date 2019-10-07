import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { DataServicesService } from '../data-services.service';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {


  constructor(private dataservice : DataServicesService) {}

  task:any[]=[];
  
  senddata(data : NgForm){
   this.dataservice.taskdata.push(data);
  console.log(this.task);
  data.reset();
  }

  
  
 

  ngOnInit() {
  }

}
