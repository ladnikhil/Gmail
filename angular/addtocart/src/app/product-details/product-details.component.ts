import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  product = {
    id : '',
    title : '',
    imgUrl : '',
    description: ''
  }

  Products : any[];

  constructor(private service : ProductService) {
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

  sendProduct(product){
      this.product.id = product.id;
      this.product.title = product.title;
      this.product.imgUrl = product.imgUrl;
      this.product.description = product.description;

  }

  updateData(key , data){
      this.service.updateData(key , data).subscribe(data => {
        console.log(data);
        this.getData();
      }, err => {
        console.log(err);
      }, () => {
        console.log("data updated successfully");
      })
  }
  
  deleteData(key){
        this.service.deleteData(key).subscribe(data => {
          console.log(data);
          this.getData();
        } , err => {
          console.log(err);
        } , () => {
          console.log("data deleted successfully");
        })
  }

}
