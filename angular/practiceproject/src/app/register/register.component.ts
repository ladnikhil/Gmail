import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl,Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  ngOnInit() {}

  get username(){
   return this.registerform.get('username');

  }

  get  password(){
    return this.registerform.get('password');
 
   }
 

  registerform = new FormGroup({

    username: new FormControl ('',[Validators.minLength(3),Validators.required]),

    password: new FormControl ('',[Validators.minLength(3),Validators.required]),

  })

  printform(form){
    console.log(form);
  }


}
