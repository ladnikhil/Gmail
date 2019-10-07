import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-showall',
  templateUrl: './showall.component.html',
  styleUrls: ['./showall.component.css']
})
export class ShowallComponent implements OnInit {

  getall :any[] = [];
  constructor(private http : HttpClient) { 
    
    this.http.get<any>('http://localhost:8081/task/get-all').subscribe(resData=>{
      this.getall = resData.tasks;
      console.log(this.getall);
  })
  }

  ngOnInit() {
  }

}
