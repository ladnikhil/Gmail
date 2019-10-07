import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {

  constructor() { }
  mobiles=[{
    brand: "Apple",
    img: "https://cdn.pixabay.com/photo/2015/11/07/11/34/autumn-1031273__340.jpg",
    description:'128 GB ROM |13.97 cm (5.5 inch) Retina HD Display12MP + 12MP | 7MP Front Camera Apple A10 Fusion 64-bit processor and Embedded M10 Motion Co-processor'
  },
  {
    brand:'Nokia',
    img: 'https://cdn.pixabay.com/photo/2015/09/06/00/50/nokia-926756__340.jpg', 
    description:'t sports a 5.99-inch 18:9 display with fullHD+ resolution and Corning Gorilla Glass for protection. The Note 5 is powered by a Snapdragon 625 processor and has up to 4GB of RAM and 64GB of internal storage. It is a dual-SIM device and has a hybrid dual-SIM tray'
  },
  {
    brand:'Samsung',
    img: 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938__340.jpg',
    description:'The Note 5 features a 5.7-inch 1440p Super AMOLED display. It is powered by a 64-bit Exynos 7 Octa 7420 system-on-chip, consisting of four 2.1 GHz Cortex-A57 cores, and four 1.5 GHz Cortex-A53 cores, and 4 GB of LPDDR4 RAM.'
  },
  {
    brand:'Lenovo',
    img: 'https://cdn.pixabay.com/photo/2016/09/08/21/52/phone-1655677__340.jpg',
    description:'Operating System. Android v6.0 (Marshmallow) 5.5 inches (13.97 cm) display. Scratch-resistant glass Protection. MediaTek MT6755 Octa core Processor. 4 GB RAM.  13 MP Rear Camera. 3500 mAh battery. Dual SIM: Nano + Nano (Hybrid) with VoLTE support.'
  },
  {
    brand:'Motorola',
    img: 'https://cdn.pixabay.com/photo/2014/06/30/07/09/phone-380008__340.jpg',
    description:'The phone comes with a 6.20-inch touchscreen display with a resolution of 1080x2270 pixels and an aspect ratio of 19:9. Motorola Moto G7 is powered by a 1.8GHz octa-core Qualcomm Snapdragon 632 processor. It comes with 4GB of RAM. The Motorola Moto G7 runs Android Pie and is powered by a 3,000mAh battery.'
  }
  ];

  mobileData:any="";
  mobileDetails(mob){
   this.mobileData = mob;
  }
  ngOnInit() {
  }

}
