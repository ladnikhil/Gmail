  import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {

  constructor() { }

  ngOnInit() {}    

  bikedata:any = '';

  bikes = [
    {
      brand: 'ktm',
      img: 'https://cdn.pixabay.com/photo/2017/11/10/17/51/motorcycle-2937057__340.jpg',
      description:'KTM AG (the former KTM Sportmotorcycle AG[3][4]) is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group.'
    },

    {
      brand: 'rx100',
      img: 'https://cdn.pixabay.com/photo/2017/03/07/16/16/supermoto-2124509__340.jpg',
      description:'KTM AG (the former KTM Sportmotorcycle AG[3][4]) is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group.'
    },

    {
      brand: 'apache',
      img: 'https://cdn.pixabay.com/photo/2017/11/10/17/51/motorcycle-2937056__340.jpg',
      description:'KTM AG (the former KTM Sportmotorcycle AG[3][4]) is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group.'

    },

    {
      brand: 'duke',
      img: 'https://cdn.pixabay.com/photo/2017/11/21/12/36/ktm-2968097__340.jpg',
      description:'KTM AG (the former KTM Sportmotorcycle AG[3][4]) is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group.'

    },
  ]

  
  sendbike(bike){
    this.bikedata = bike;

  }

}
