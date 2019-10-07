import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl, Validators} from '@angular/forms';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }


  get name(){
    return this.registerform.get('name');/// to get data from class
  }

  
  get name2(){
    return this.registerform.get('name2');/// to get data from class
  }



  
  get email(){
    return this.registerform.get('email');
  }

  
  get phno(){
    return this.registerform.get('phno');
  }

  
  get password(){
    return this.registerform.get('password');
  }

  get reenter_password(){
    return this.registerform.get('reenter_password');
  }




  

  registerform = new FormGroup({

    name: new FormControl('',[Validators.minLength(3),Validators.required]),

    name2: new FormControl('',[Validators.minLength(3),Validators.required]),


    email :new FormControl('',[Validators.email,Validators.minLength(5),Validators.required]),

    phno : new FormControl('',[Validators.minLength(10),Validators.required]),

    password : new FormControl('',[Validators.minLength(4),Validators.required]),

    reenter_password: new FormControl('',[Validators.minLength(4),Validators.required])
  })

  printform(form){
    console.log(form);
  }

  ngOnInit() {
  }

}