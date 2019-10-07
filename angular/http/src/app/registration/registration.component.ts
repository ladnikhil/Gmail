import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor() { }

  get name(){
   return this.registerform.get('name');
  }

  get name1(){
    return this.registerform.get('name1');
   }

   get email(){
    return this.registerform.get('email');
   }

   get password(){
    return this.registerform.get('password');
   }

   
   get reenter_password(){
    return this.registerform.get('reenter_password');
   }



  registerform = new FormGroup({

    name : new FormControl('',[Validators.required,Validators.minLength(5)]),

    name1 : new FormControl('',[Validators.required,Validators.minLength(5)]),

    email: new FormControl('',[Validators.required,Validators.minLength(5)]),

    password: new FormControl('',[Validators.required,Validators.minLength(5)]),

    reenter_password : new FormControl('',[Validators.required,Validators.minLength(5)])
  })

  
  printform(form){
    console.log(form);
  }

  ngOnInit() {
  }

}
