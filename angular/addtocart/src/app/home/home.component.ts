import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  Products : any[];

  constructor(private service  : ProductService) { 
    this.getData();
  }

  ngOnInit() {
  }

  getData() {
    this.service.getData().subscribe(data => {
        this.Products = data;
    } , err => {
      console.log(err);
    } , () => {
      console.log("data got Successfully");
    })
  }

}
