import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';

import { Router } from '@angular/router';



@Component({
  selector: 'app-edittask',
  templateUrl: './edittask.component.html',
  styleUrls: ['./edittask.component.css']
})
export class EdittaskComponent implements OnInit {

  constructor(private service : TaskserviceService, private router : Router) { }

 

  deleteTask(task){
    this.service.deletee(task).subscribe(data=>{
      console.log(data);
    },()=>{
      console.log("data successfully deleted");
    })
  }

  updateTask(task){
    this.service.updateData(task);
     
  }
    


  ngOnInit() {
    this.service.getData();
  }




}
