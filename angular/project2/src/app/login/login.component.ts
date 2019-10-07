import { Component, OnInit, ɵConsole } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  users :any[] = [];

  printform(LoginForm: NgForm){
    console.log(LoginForm.value);
    this.users.push(LoginForm.value);
    console.log(this.users);
    LoginForm.reset();

  }

}
