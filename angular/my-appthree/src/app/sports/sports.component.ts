import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.css']
})
export class SportsComponent implements OnInit {

  constructor() { }

  sportsdata: any = '';

  sports = [
    {
      name: 'cricket',
      imgurl: 'https://image.shutterstock.com/image-photo/group-young-cricketers-doing-high-260nw-1229815870.jpg',
      description: 'There are various formats ranging from Twenty20, played over a few hours with each team batting for a single innings of 20 overs, to Test matches, played over five days with unlimited overs and the teams each batting for two innings of unlimited length. Traditionally cricketers play in all-white kit, but in limited overs cricket they wear club or team colours.'
      
    },

    {
      name: 'football',
      imgurl: 'https://media-public.canva.com/MADFCg1V6rg/1/thumbnail_large.jpg',
      description: 'Football is a family of team sports that involve, to varying degrees, kicking a ball to score a goal. Unqualified, the word football normally means the form of football that is the most popular where the word is used'
    },

    {
      name: 'hockey',
      imgurl: 'https://image.shutterstock.com/image-photo/woman-play-hockey-mixed-media-260nw-455858755.jpg',
      description: 'Field hockey is played on gravel, natural grass, or sand-based or water-based artificial turf, with a small, hard ball approximately 73 mm (2.9 in) in diameter. The game is popular among both males and females in many parts of the world, particularly in Europe, Asia, Australia, New Zealand, South Africa, and Argentina. In most countries, the game is played between single-sex sides, although they can be mixed-sex.'

    },

    {
      name: 'badminton',
      imgurl: 'https://image.shutterstock.com/image-photo/playing-badminton-on-court-260nw-794204539.jpg',
      description: 'The shuttlecock is a feathered or (in informal matches) plastic projectile which flies differently from the balls used in many other sports. In particular, the feathers create much higher drag, causing the shuttlecock to decelerate more rapidly. Shuttlecocks also have a high top speed compared to the balls in other racquet sports. The flight of the shuttlecock gives the sport its distinctive nature.'

    },
]

sendsports(sport){
  this.sportsdata = sport;
}

  ngOnInit() {
  }

}
