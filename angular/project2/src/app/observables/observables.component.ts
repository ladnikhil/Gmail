import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent  {

  users: any[]=[];
  constructor(private http: HttpClient) {
    http.get<any>('https://api.github.com/users').subscribe(resData=>{
      this.users = resData;
      console.log(this.users);

    })
  }

  deletedata(u){
    this.users.splice(u,1,); // to delete api

    }
  

}
