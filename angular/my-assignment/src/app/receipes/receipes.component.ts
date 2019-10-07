import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receipes',
  templateUrl: './receipes.component.html',
  styleUrls: ['./receipes.component.css']
})
export class ReceipesComponent implements OnInit {

  receipedata:any = '';

  receipes = [
    {
      name:'pav bhaji',
      img:'https://image.shutterstock.com/image-photo/pav-bhaji-fast-food-dish-260nw-664424710.jpg',
      description:'The dish originated in the 1850s as a fast lunchtime dish for textile mill workers in Mumbai.[2][3] Pav bhaji was later served at restaurants throughout the city.[3][4] Pav bhaji is now offered at outlets from simple hand carts to formal restaurants in India and abroad'

    },

    {
      name:'biryani',
      img:'https://image.shutterstock.com/image-photo/spicy-chicken-biryani-260nw-651649741.jpg',
      description:'Biryani (pronounced [bɪr.jaːniː]), also known as biriyani, biriani, birani or briyani, is a mixed rice dish with its origins among the Muslims of the Indian subcontinent.[1][2][3] It can be compared to mixing a curry, later combining it with semi-cooked rice separately. This dish is especially popular throughout the Indian subcontinent, as well as among the diaspora from the region. It is also prepared in other regions such as Iraqi Kurdistan.[4] It is made with Indian spices, rice, meat (chicken, goat, beef, lamb, prawn, or fish), vegetables or eggs.'

    },

    {
      name:'tomato soup',
      img:'https://image.shutterstock.com/image-photo/tomato-soup-on-wooden-table-260nw-466519397.jpg',
      description:'Tomato soup is a soup made with tomatoes as the primary ingredient. It may be served hot or cold in a bowl, and may be made in a variety of ways.[1] It may be smooth in texture, and there are also recipes which include chunks of tomato, cream and chicken or vegetable stock. Popular toppings for tomato soup include sour cream or croutons. In the United States, the soup is frequently served with crackers, which may be crumbled onto the soup by the diner, and a grilled cheese sandwich. Tomato soup is one of the top comfort foods in Poland[2] and the United States.[3] It can be made fresh by blanching tomatoes, removing the skins, then blending them into a puree.'

    },

    {
      name:'pasta',
      img:'https://image.shutterstock.com/image-photo/plate-penne-pasta-tomato-sauce-260nw-136439594.jpg',
      description:'Pasta (Italian pronunciation: [ˈpasta]) is a type of food typically made from an unleavened dough of durum wheat flour (semolina) mixed with water or eggs, and formed into sheets or various shapes, then cooked by boiling or baking. Rice flour, or legumes such as beans or lentils, are sometimes used in place of wheat flour to yield a different taste and texture, or as a gluten-free alternative. Pasta is a staple food of Italian cuisine.'
      
    },

    {
      name:'burger',
      img:'https://image.shutterstock.com/image-photo/fresh-tasty-burger-on-black-260nw-334280822.jpg',
      description:'The term "burger" can also be applied to the meat patty on its own, especially in the United Kingdom, where the term "patty" is rarely used, or the term can even refer simply to ground beef. Since the term hamburger usually implies beef, for clarity "burger" may be prefixed with the type of meat or meat substitute used, as in beef burger, turkey burger, bison burger, or veggie burger.'

    }
  ]
  constructor() { }

  sendreceipe(receipe){
    this.receipedata = receipe;
  }

  ngOnInit() {
  }

}
