import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  taskDetail :any[] = [];
  constructor(private http: HttpClient,private router : Router) {

    
    this.http.get<any>(`http://localhost:8081/task/get-all`).subscribe(resData=>{
    this.taskDetail = resData.tasks;
     console.log(this.taskDetail);
    })

   }

  
  detail:any="";
  addDetails(register){
     this.http.post(`http://localhost:8081/task/add`,register).subscribe();
    alert("Added");
    this.router.navigateByUrl('/edittask');

   
  }


  delete(i){
    this.http.delete(`http://localhost:8081/task/remove/${i}`).subscribe();
    alert("deleted");
    
  }
   
  updateDetails(update){
    this.http.put(`http://localhost:8081/task/modify`,update).subscribe();
    alert("updated");
    
  }





  ngOnInit() {
  }

}
