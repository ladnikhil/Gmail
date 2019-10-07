import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }
  users = [];

  printdata(Loginform: NgForm){
    Loginform.reset();
    console.log(Loginform.value);
    this.users.push(Loginform.value);
    console.log(this.users);

  }

  ngOnInit() {
  }

}
