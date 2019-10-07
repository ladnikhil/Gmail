import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  indianNews: any[] = [];
  constructor(private http: HttpClient ) { 
    http.get<any>('https://newsapi.org/v2/everything?q=bitcoin&from=2019-07-12&sortBy=publishedAt&apiKey=596bb71371a94d6ab53c72d7159608ae').subscribe(resData=>{
      this.indianNews = resData.articles;
      console.log(this.indianNews);
    })
  
  }

  ngOnInit() {
  }

}
