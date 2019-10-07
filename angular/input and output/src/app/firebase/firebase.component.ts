import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-firebase',
  templateUrl: './firebase.component.html',
  styleUrls: ['./firebase.component.css']
})
export class FirebaseComponent implements OnInit {

  constructor(private firebaseService : FirebaseService , private router : Router) { }

  ngOnInit() {
  }


  postuser(form : NgForm){
    this.firebaseService.postData(form.value).subscribe(data =>{
      console.log(data);
      this.firebaseService.getData();
      form.reset(); /// to reset
      this.router.navigateByUrl('/users');
    },err =>{
      console.log(err);
    })
  }


}
