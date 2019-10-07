import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receipes',
  templateUrl: './receipes.component.html',
  styleUrls: ['./receipes.component.css']
})
export class ReceipesComponent implements OnInit {

  constructor() { }

  ngOnInit() {}

  receipesdata = '';

  receipes = [
    {
      name:'pav bhaji',
      imgurl:'https://image.shutterstock.com/image-photo/pav-bhaji-fast-food-dish-260nw-664424710.jpg',
      descripton:'The dish originated in the 1850s as a fast lunchtime dish for textile mill workers in Mumbai.[2][3] Pav bhaji was later served at restaurants throughout the city.[3][4] Pav bhaji is now offered at outlets from simple hand carts to formal restaurants in India and abroad.[5]['
    },

    {
      name:'chicken biryani',
      imgurl:'https://image.shutterstock.com/image-photo/close-homemade-chicken-tikka-biryani-260nw-1025313970.jpg',
      descripton:'Biryani (pronounced [bɪr.jaːniː]), also known as biriyani, biriani, birani or briyani, is a mixed rice dish with its origins among the Muslims of the Indian subcontinent.[1][2][3] It can be compared to mixing a curry, later combining it with semi-cooked rice separately. This dish is especially popular throughout the Indian subcontinent, as well as among the diaspora from the region. It is also prepared in other regions such as Iraqi Kurdistan.[4] It is made with Indian spices, rice, meat (chicken, goat, beef, lamb, prawn, or fish), vegetables or eggs.'
    
    },

    {
      name:'momos',
      imgurl:'https://image.shutterstock.com/image-photo/nepalese-traditional-dumpling-momos-served-260nw-594827216.jpg',
      descripton:'Momo is a type of South Asian dumpling, popular across the Indian subcontinent and the Himalayan regions of broader South Asia.[1] Momos are native to Tibet, Bhutan, Nepal, North Indian region of Ladakh,[1] Northeast Indian regions of Sikkim, Assam, and Arunachal Pradesh,[1] and Darjeeling.[1] It is similar to Chinese xiǎo miàn and jiaozi, Mongolian buuz, Japanese gyoza and Korean mandu, but heavily influenced by cuisine of the Indian subcontinent with Indian spices and herbs.[1]'
      
    },

    {
      name:'ras malai',
      imgurl:'https://image.shutterstock.com/image-photo/ras-malai-rossomalai-dessert-bengal-260nw-358062689.jpg',
      descripton:'Ras malai, also known as rossomalai (rōśomālāi), is a Bengali dessert. It has been described as "a rich cheese cake without a crust".[1] It is considered to be a variation of the rasgulla in which syrup is replaced with thick milk.[2]'

    },

    {
      name:'gulab jamun',
      imgurl:'https://image.shutterstock.com/image-photo/gulab-jaman-white-square-dish-260nw-670493992.jpg',
      descripton:'Gulab jamun (also spelled gulaab jamun) is a milk-solid-based sweet from the Indian subcontinent, popular in India, Nepal (where it is known as gulab jamun), Pakistan, the Maldives (where it is known as gulaabujaanu), and Bangladesh (where it is known as golap jam), as well as Myanmar. It is also common in Mauritius, Fiji, southern and eastern Africa, Malay Peninsula, and the Caribbean countries of Trinidad and Tobago, Guyana, Suriname and Jamaica. It is made mainly from milk solids, traditionally from Khoya, which is milk reduced to the consistency of a soft dough. Modern recipes call for dried/powdered milk instead of Khoya. It is often garnished with dried nuts such as almonds to enhance flavour.'

    }

  ]


sendreceipe(r){
  this.receipesdata = r;
}
}
