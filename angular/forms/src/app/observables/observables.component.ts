import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
//import { interval } from 'rxjs';

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit {

  constructor(private username: UserService ) { }

  user: any = [];
  ngOnInit() {
    // interval(1000).subscribe(data=>{             // returns data after specific period
    //   console.log(data);
    // })

    this.user = this.username.details();
  }

}
