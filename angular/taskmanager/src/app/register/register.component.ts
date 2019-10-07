import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

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

  get password(){
    return this.registerform.get('password');
  }

  registerform = new FormGroup({
    username : new FormControl('' ,[Validators.required,Validators.minLength(5)]),
    password: new FormControl('' ,[Validators.required,Validators.minLength(5)])
})

// printform(form){
//   console.log(form);
// }

}
