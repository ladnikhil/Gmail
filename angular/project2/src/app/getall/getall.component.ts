import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-getall',
  templateUrl: './getall.component.html',
  styleUrls: ['./getall.component.css']
})
export class GetallComponent implements OnInit {

  getall :any[] = [];
  constructor(private http: HttpClient) { 

    this.http.get<any>('http://localhost:8081/employee/get-all').subscribe(resData=>{
      this.getall = resData.employees;
      console.log(this.getall);
    })
  }

  ngOnInit() {
  }

}
