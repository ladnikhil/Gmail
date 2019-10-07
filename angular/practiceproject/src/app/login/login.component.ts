import { Component, OnInit, ɵConsole } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  user :any[] = [];

  ngOnInit() {
  }

  printform(LoginForm : NgForm){
    console.log(LoginForm.value);
    LoginForm.reset();
    this.user.push(LoginForm.value);
    console.log(this.user);
  }

}
