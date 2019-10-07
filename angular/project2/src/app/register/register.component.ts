import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  get user(){
    return this.LoginForm.get('username');
  
  }

  get password(){
    return this.LoginForm.get('password');
  
  }





  ngOnInit() {}

  LoginForm = new FormGroup({
    username: new FormControl ('',[Validators.required,Validators.minLength(5)]),
    password: new FormControl ('',[Validators.required,Validators.minLength(5)])
  })

  printform(data){
console.log(data);
  }


}
