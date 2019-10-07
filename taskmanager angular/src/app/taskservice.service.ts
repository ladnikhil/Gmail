import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class TaskserviceService {

  constructor(private http: HttpClient,private router: Router) { }

  taskDet :any[]=[];
  getData(){
    
    this.http.get<any>(`http://localhost:8081/task/get-all`).subscribe(resData=>{
    this.taskDet = resData.tasks;
     console.log(this.taskDet);
    })
  }


   
  detail:any="";
  senddata(register){
     this.http.post(`http://localhost:8081/task/add`,register).subscribe();
    
  
   
  }


  deletee(id){
    return this.http.delete(`http://localhost:8081/task/remove/${id}`);
    
    
  }
   
  updateData(update){
   return this.http.put(`http://localhost:8081/task/modify`,update).subscribe();
   
    
  }


}
