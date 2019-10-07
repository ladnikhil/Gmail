import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  
    
  generalnews: any[]=[];
  sportsnews: any[]=[];
  entertainmentnews: any[]=[];
  constructor(private http: HttpClient ) { 
    this.http.get<any>('https://newsapi.org/v2/top-headlines?category=general&apiKey=596bb71371a94d6ab53c72d7159608ae').subscribe(resData=>{
      this.generalnews = resData.articles;
      console.log(this.generalnews);


      this.http.get<any>('http://newsapi.org/v2/top-headlines?category=sports&apiKey=596bb71371a94d6ab53c72d7159608ae').subscribe(resData=>{
        this.sportsnews = resData.articles;
        console.log(this.sportsnews);


        this.http.get<any>('http://newsapi.org/v2/top-headlines?category=entertainment&apiKey=596bb71371a94d6ab53c72d7159608ae').subscribe(resData=>{
          this.entertainmentnews = resData.articles;
          console.log(this.entertainmentnews);
        })
      })
    })
  
  }

  ngOnInit() {
  }

}
