import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  
  EmployeeDetail:any[]=[];
  constructor(private http : HttpClient,private router: Router) {

    
    this.http.get<any>(`http://localhost:8081/employee/get-all`).subscribe(resData=>{
    this.EmployeeDetail = resData.employees;
     console.log(this.EmployeeDetail);
    })


   }

 
   
   detail:any="";
   addDetails(register){
      this.http.post(`http://localhost:8081/employee/add`,register).subscribe();
     alert("Added");
    this.router.navigateByUrl("firebase");
    
   }

   delete(i){
    this.http.delete(`http://localhost:8081/employee/remove/${i}`).subscribe();
    alert("deleted");
    //this.router.navigateByUrl("users");
  }
   
  updateDetails(update){
    this.http.put(`http://localhost:8081/employee/modify`,update).subscribe();
    alert("updated");
    this.router.navigateByUrl("firebase");
  }





  ngOnInit() {
  }

}
