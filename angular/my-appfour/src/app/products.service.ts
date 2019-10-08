import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  firebaseurl = 'https://product-c3c2e.firebaseio.com/';


  constructor(private http: HttpClient) { }

  //to send data

  senddata(data){
    this.http.post(`${this.firebaseurl}/product.json`,data);
;  }

  
}
