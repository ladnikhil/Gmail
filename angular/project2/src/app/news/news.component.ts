import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {


  news :any[] = [];
  constructor(private http :HttpClient) { 

    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=596bb71371a94d6ab53c72d7159608ae').subscribe(resData=>{
      this.news = resData.articles;
      console.log(this.news);
    })

  }

  ngOnInit() {
  }

}
