import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.css']
})
export class EmployeeDetailComponent implements OnInit {

  EmployeeDetail:any[]=[];
  constructor(private http : HttpClient,private router: Router) {

    this.http.get<any>(`http://localhost:8081/employee/get-all`).subscribe(resData=>{
    this.EmployeeDetail = resData.employeeList;
     console.log(this.EmployeeDetail);
    })

   }

   detail:any="";
   addDetails(register){
      this.http.post(`http://localhost:8081/employee/add`,register).subscribe();
     alert("Added");
    this.router.navigateByUrl("AddTask");
   }

   delete(i){
    this.http.delete(`http://localhost:8081/employee/remove/${i}`).subscribe();
    alert("deleted");
    this.router.navigateByUrl("AddTask");
  }
   
  updateDetails(update){
    this.http.put(`http://localhost:8081/employee/modify`,update).subscribe();
    alert("updated");
    this.router.navigateByUrl("AddTask");
  }

   ngOnChanges(){
    
    
   }
 
   

  ngOnInit() {
  }

}
