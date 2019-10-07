import { Component, OnInit } from '@angular/core';
import { UsersService } from '../users.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-taskmanager',
  templateUrl: './taskmanager.component.html',
  styleUrls: ['./taskmanager.component.css']
})
export class TaskmanagerComponent implements OnInit {

  constructor(private service: UsersService) { }

 viewoftable = false;


  printform(LoginForm: NgForm){
    console.log(LoginForm.value);
    this.viewoftable = true;
    this.service.viewdata.push(LoginForm.value);
    console.log(this.service.viewdata);
    LoginForm.reset();
  }


  delete(v){
    this.service.viewdata.splice(v,1);
  }


  j:number = 0;

  update(i){
    this.j = i;
  }


  updateform(data){
    this.service.viewdata[this.j] = data;
  }





  ngOnInit() {
  }

}
