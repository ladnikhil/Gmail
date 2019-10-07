import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  users :any[] = [];

  printForm(form : NgForm){
    console.log(form.value);
    this.users.push(form.value);
    form.reset();
    console.log(this.users);
  }

  ngOnInit() {
  }

}
