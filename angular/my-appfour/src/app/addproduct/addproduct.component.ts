import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ProductsService } from '../products.service';
//import { Router } from '@angular/router';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private service: ProductsService) { }

  senddata(data){
    this.service.senddata(data).subscribe(data=>{
      console.log(data);
    })

  }

  ngOnInit() {
    
  }

}
