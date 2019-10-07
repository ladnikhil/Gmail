import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import{ user } from './users/user';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {

  
  url: string = 'http://localhost:8081/employee/';

  selectedUser: user = {
    name :null,
    email: null,
    password: null,
    id:null
  }

  constructor(private http : HttpClient) { }

  users = [];

  getData(){
  this.http.get(`${this.url}/get-all`).pipe(map(resData =>{
    let usersArray = [];
    for(let key in resData){              
      usersArray.push({...resData[key], id:key});        
    }

    return usersArray;
  })).subscribe(data=>{
    this.users = data;
    console.log(data);

  } ,err=>{
    console.log(err);
  });
}  


postData(data){                                                 
  return this.http.post(`${this.url}/add`,data);     
}

deletedata(data){
  return this.http.delete(`${this.url}/remove/${data}`);
}

updatedata(data){
  return this.http.put(`${this.url}users/${data.id}.json`,data);
 }

ngDoCheck(){                         
  this.getData();
}

}
