import { Component, OnInit, ɵConsole } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user = [];
  constructor() { }

  printform(Loginform: NgForm){
    console.log(Loginform.value);
    this.user.push(Loginform.value);
    Loginform.reset();
    console.log(this.user);
  }

  ngOnInit() {
  }

}
