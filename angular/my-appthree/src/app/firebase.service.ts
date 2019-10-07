import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { user } from './users/user';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {

  constructor(private httpclient : HttpClient) { }

  url: string = 'https://product-c3c2e.firebaseio.com/';

  user =  [];

  selectedUser: user = {
    name :null,
    email: null,
    phno: null,
    id:null
  }

  getdata(){
    this.http.get(`{$this.url}/product.json`).pipe(map(resData=>{
      let userarray = [];
      for(let key in resData){
        userarray.push({...resData[key] ,id:key });
      }
      return userarray;
    })).subscribe(data=>{
      this.user = data;
      console.log(data);

    }),err=>{
      console.log(err);
    }
  }

  postData(data){
    return this.http.post(`{$this.url}/product.json`,data);
  }





}
