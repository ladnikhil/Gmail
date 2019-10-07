import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-world',
  templateUrl: './world.component.html',
  styleUrls: ['./world.component.css']
})
export class WorldComponent implements OnInit {

  businessnews: any[] = [];
  sciencenews: any[] = [];
  technologynews: any[] = [];

  constructor(private http: HttpClient) {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?category=business&apiKey=596bb71371a94d6ab53c72d7159608ae').subscribe(resData=>{
      this.businessnews = resData.articles;
      console.log(this.businessnews);
    })

    this.http.get<any>('https://newsapi.org/v2/top-headlines?category=science&apiKey=596bb71371a94d6ab53c72d7159608ae').subscribe(resData=>{
      this.sciencenews = resData.articles;
      console.log(this.sciencenews);
    })

    this.http.get<any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=596bb71371a94d6ab53c72d7159608ae').subscribe(resData=>{
      this.technologynews = resData.articles;
      console.log(this.technologynews);
    })



   }



  ngOnInit() {
  }

}
