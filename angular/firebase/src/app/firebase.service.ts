import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { user } from './users/user';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService  {

  url: string = 'https://angular-http-3aa44.firebaseio.com/';

  selectedUser: user = {
    name :null,
    email: null,
    phno: null,
    id:null
  }

  constructor(private http: HttpClient) { }
    
  users = [];

    getData(){
    this.http.get(`${this.url}/users.json`).pipe(map(resData =>{
      let usersArray = [];
      for(let key in resData){              // forr looping through array
        usersArray.push({...resData[key], id:key});        ////// we used ... because we used spread operatorher
      }

      return usersArray;
    })).subscribe(data=>{
      this.users = data;
      console.log(data);

    } ,err=>{
      console.log(err);
    });
  }  



  postData(data){                                                  // takes 2 data always  
    return this.http.post(`${this.url}/users.json`,data);     // HERE WE CAN GIVE ANY EXTENSION BUT HERE WE HAVE GIVEN /users.json
  }

  //update dataa

  updatedata(data){
   return this.http.put(`${this.url}users/${data.id}.json`,data);
  }

  //delete data

  deletedata(data){
    return this.http.delete(`${this.url}users/${data.id}.json`);
  }


  ngDoCheck(){                         //  to update if we do any changes
    this.getData();
  }
}
