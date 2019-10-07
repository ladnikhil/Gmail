import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

 cardata: any='';

  cars =[
    {
      brand:'bmw',
      img:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      description:'BMW (German pronunciation: [ˈbeːˈʔɛmˈveː] (About this soundlisten)) is a German multinational company which produces automobiles and motorcycles. The company was founded in 1916 as a manufacturer of aircraft engines, which it produced from 1917 until 1918 and again from 1933 to 1945.Automobiles are marketed under the brands BMW, Mini and Rolls-Royce, and motorcycles are marketed under the brand BMW Motorrad. In 2015, BMW was the world'

    },

    {
      brand:'mercedes',
      img:'https://cdn.pixabay.com/photo/2018/05/20/23/36/mercedes-3417100__340.jpg',
      description:'Mercedes-Benz (German: [mɛɐ̯ˈtseːdəsˌbɛnts, -dɛs-])[3][4] is a German global automobile marque and a division of Daimler AG. The brand is known for luxury vehicles, buses, coaches, and trucks. The headquarters is in Stuttgart, Baden-Württemberg. The name first appeared in 1926 under Daimler-Benz. In 2018, Mercedes-Benz was the biggest selling premium vehicle brand in the world, having sold 2.31 million passenger cars.[5]'
      
    },

    {
      brand:'toyota',
      img:'https://cdn.pixabay.com/photo/2017/11/12/16/32/toyota-land-cruiser-2943058__340.jpg',
      description:'Toyota Motor Corporation (Japanese: トヨタ自動車株式会社 Hepburn: Toyota Jidōsha KK, IPA: [toꜜjota], English: /tɔɪˈoʊtə/) is a Japanese multinational automotive manufacturer headquartered in Toyota, Aichi, Japan.Toyota is headquartered in Toyota City, Aichi.[11] The main headquarters of Toyota is located in a four-story building in Toyota.'
    },

    {
      brand:'suzuki',
      img:'https://cdn.pixabay.com/photo/2019/06/29/09/51/suzuki-sx4-4305877__340.jpg',
      description:'Suzuki Motor Corporation (Japanese: スズキ株式会社 Hepburn: Suzuki Kabushiki-Kaisha)[3] is a Japanese multinational corporation headquartered in Minami-ku, Hamamatsu.[4] Suzuki manufactures automobiles, four-wheel drive vehicles, motorcycles, all-terrain vehicles (ATVs), outboard marine engines, wheelchairs and a variety of other small internal combustion engines.'

    },

    {
      brand:'hyundai',
      img:'https://cdn.pixabay.com/photo/2017/05/31/03/52/car-2358976__340.jpg',
      description:'The Hyundai Motor Company, commonly known as Hyundai Motors (Korean: 현대자동차; Hanja: 現代自動車; RR: Hyeondae Jadongcha About this soundlisten; Korean: 현대; Hanja: 現代; RR: Hyeondae, IPA: [hjə́ːndɛ],[3] modernity; KRX: 005380), is a South Korean multinational automotive manufacturer headquartered in Seoul.'

    }
  ]
  constructor() { }

  sendcar(car){
    this.cardata = car;
  }

  ngOnInit() {
  }

}
