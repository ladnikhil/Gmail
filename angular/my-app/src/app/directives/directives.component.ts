import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
  condition = false;
  users = [
    {
      id : 1,
      name : 'nikhil',
      city :'mumbai'
    },

    {
      id : 2,
      name : 'sanket',
      city :'pune'
    },

    {
      id : 3,
      name : 'vikas',
      city :'delhi'
    },

    {
      id : 4,
      name : 'akshay',
      city :'mumbai'
    },

    {
      id : 5,
      name : 'omkar',
      city :'chennai'
    }


   
  ]

  constructor() { }

  cut(){
    this.condition = false;
  }

  removeuser(j){
    let index = this.users.indexOf(j);
    this.users.splice(index, 1);
    this.condition = true;
  }
  
  ngOnInit() {
  }

}
