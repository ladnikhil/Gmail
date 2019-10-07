import { Component, OnInit } from '@angular/core';
import {  FirebaseService } from '../firebase.service';

@Component({
  selector: 'app-firebase',
  templateUrl: './firebase.component.html',
  styleUrls: ['./firebase.component.css']
})
export class FirebaseComponent implements OnInit {

  constructor(private firebaseservice :  FirebaseService ) { }

  ngOnInit() {
  }

}
