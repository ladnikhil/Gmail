import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  fireBaseURL = 'https://shoping-6cf38.firebaseio.com/';

  constructor(private http : HttpClient) { }

  sendData(data) {
    return this.http.post(`${this.fireBaseURL}/product.json` , data);
  }

  getData() {
    return this.http.get(`${this.fireBaseURL}/product.json`).pipe(map(data => {
                let newArray : any[] = [];
                for(let key in data){
                  newArray.push({...data[key] , id : key });
                }
                return newArray;
    }))
  }

  updateData(key , data) {
   return this.http.patch(`${this.fireBaseURL}/product/${key}.json` , data);
  }

  deleteData(key){
    return this.http.delete(`${this.fireBaseURL}/product/${key}.json`)
  }


}
