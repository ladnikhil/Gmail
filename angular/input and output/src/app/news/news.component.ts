import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  indiannews :any[] = [];
  constructor(private http : HttpClient) { 

    this.http.get<any>('https://jsonplaceholder.typicode.com/users').subscribe(resData=>{
      this.indiannews = resData;
      console.log(this.indiannews);
    })
  }

  

  delete(n){
   let us = this.indiannews.indexOf(this.indiannews);
   this.indiannews.splice(us,1, );
  }

  ngOnInit() {
  }

}
