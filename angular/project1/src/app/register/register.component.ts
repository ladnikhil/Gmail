import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  printform(form: NgForm){
    console.log(form.value);          // to get value of loginform
    form.reset();                    // to reset form using ngfom

  }

  ngOnInit() {
  }

}
