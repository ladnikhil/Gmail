import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receipes',
  templateUrl: './receipes.component.html',
  styleUrls: ['./receipes.component.css']
})
export class ReceipesComponent implements OnInit {

  constructor() { }

  receipesdata : any = '';

  receipes = [
    {
      name:'pavbhaji',
      imgurl : 'https://pixabay.com/go/?t=image-list-shutterstock&id=277868768',
      description: 'The dish originated in the 1850s as a fast lunchtime dish for textile mill workers in Mumbai.[2][3] Pav bhaji was later served at restaurants throughout the city.[3][4] Pav bhaji is now offered at outlets from simple hand carts to formal restaurants in India and abroad.[5][6]'

    },

    {
      name:'biryani',
      imgurl : 'https://image.shutterstock.com/image-photo/close-homemade-chicken-tikka-biryani-260nw-1025313970.jpg',
      description: 'According to Pratibha Karan, who authored the book Biryani, the biryani is of South Indian origin, derived from pilaf varieties brought to the Indian subcontinent by the Arab traders. She speculates that the pulao was an army dish in medieval India'

    },

    {
      name:'dalrice',
      imgurl : 'https://image.shutterstock.com/image-photo/assorted-indian-food-lunch-dinner-260nw-1130156048.jpg',
      description: 'Dal may be cooked with onion, garlic, ginger, chili, tomatoes, or tamarind, in addition to lentils or beans. It always contains herbs and spices such as coriander, garam masala, cumin, and turmeric. Recipes vary by season, locality, ethnic group and family.'

    },


  ]


  sendreceipe(r){
    this.receipesdata = r;
  }
  ngOnInit() {
  }

}
