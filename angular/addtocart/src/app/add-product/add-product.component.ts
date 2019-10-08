import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private service : ProductService) { }

  ngOnInit() {
  }

  sendData(data){
      this.service.sendData(data).subscribe(data => {
        console.log(data);
      }, err => {
        console.log(err);
      }, () => {
        console.log("data Sent Successfully");
      })
  }

}
