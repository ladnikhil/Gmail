import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private firebaseService : FirebaseService , private router : Router) { }

  ngOnInit() {
    this.firebaseService.getData();
    console.log(this.firebaseService.users);
  }

  deletedata(user){
    this.firebaseService.deletedata(user).subscribe(resData =>{
      console.log(resData);
      this.firebaseService.getData();
    })
  }
}
