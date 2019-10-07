import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {

  moviearray:any[] = [];
  constructor(private http: HttpClient) { }

  searchmovies(movie){

    console.log(movie);
    this.http.get<any>(`http://www.omdbapi.com/?s=${movie}&apikey=e9b818b9`).subscribe(resData=>{
    this.moviearray = resData.Search;
    console.log(this.moviearray);
    })
  }



  ngOnInit() {
  }

}
