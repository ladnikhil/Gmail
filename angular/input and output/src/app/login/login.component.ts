import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private service : UsersService) { }

  viewOfTable = false;


  printform(Loginform : NgForm){
    console.log(Loginform.value);
    this.viewOfTable = true;
    this.service.viewdata.push(Loginform.value);
    console.log(this.service.viewdata);
    Loginform.reset();

  }

  delete(i){
    this.service.viewdata.splice(i,1,);
    console.log(i);
    this.viewOfTable = false; 
  }

  j :number = 0;

  update(i){
    this.j = i;
    
  }

  updateuser(data){
    this.service.viewdata[this.j]=data;
  }



  ngOnInit() {
  }

}
