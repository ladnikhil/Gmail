import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.css']
})
export class SportsComponent implements OnInit {

  sportsdata: any = '';

  constructor() { }

  sports = [
    {
      name: 'cricket',
      img: 'https://image.shutterstock.com/image-photo/cricket-ball-resting-on-bat-260nw-114007321.jpg',
      description: 'Cricket is a bat-and-ball game played between two teams of eleven players on a field at the centre of which is a 20-metre (22-yard) pitch with a wicket at each end, each comprising two bails balanced on three stumps. The batting side scores runs by striking the ball bowled at the wicket with the bat, while the bowling and fielding side tries to prevent this and dismiss each player (so they are "out"). Means of dismissal include being bowled, when the ball hits the stumps and dislodges the bails, and by the fielding side catching the ball after it is hit by the bat, but before it hits the ground. When ten players have been dismissed, the innings ends and the teams swap roles.'
      
    },

    {
      name: 'badminton',
      img: 'https://image.shutterstock.com/image-photo/playing-badminton-on-court-260nw-794204539.jpg',
      description: 'Badminton is a racquet sport played using racquets to hit a shuttlecock across a net. Although it may be played with larger teams, the most common forms of the game are "singles" (with one player per side) and "doubles" (with two players per side). Badminton is often played as a casual outdoor activity in a yard or on a beach; formal games are played on a rectangular indoor court. Points are scored by striking the shuttlecock with the racquet and landing it within the opposing side.'
      

    },

    {
      name: 'football',
      img: 'https://image.shutterstock.com/image-photo/soccer-best-moments-mixed-media-260nw-693565393.jpg',
      description: 'There are a number of references to traditional, ancient, or prehistoric ball games played in many different parts of the world.[3][4][5] Contemporary codes of football can be traced back to the codification of these games at English public schools during the nineteenth century.[6][7] The expansion of the British Empire allowed these rules of football to spread to areas of British influence outside the directly controlled Empire.[8] By the end of the nineteenth century, distinct regional codes were already developing: Gaelic football, for example, deliberately incorporated the rules of local traditional football games in order to maintain their heritage.[9] In 1888, The Football League was founded in England, becoming the first of many professional football competitions. During the twentieth century, several of the various kinds of football grew to become some of the most popular team sports in the world.'
      
    },

    {
      name: 'tennis',
      img: 'https://image.shutterstock.com/image-photo/tennis-ball-racket-on-hard-260nw-545014621.jpg',
      description: 'Tennis is an Olympic sport and is played at all levels of society and at all ages. The sport can be played by anyone who can hold a racket, including wheelchair users. The modern game of tennis originated in Birmingham, England, in the late 19th century as lawn tennis.[1] It had close connections both to various field (lawn) games such as croquet and bowls as well as to the older racket sport today called real tennis. During most of the 19th century, in fact, the term tennis referred to real tennis, not lawn tennis.'

    },

    {
      name: 'chess',
      img: 'https://image.shutterstock.com/image-photo/chess-image-260nw-415260958.jpg',
      description: 'Chess is a two-player strategy board game played on a checkered board with 64 squares arranged in an 8×8 grid.[1] The game is played by millions of people worldwide. Chess is believed to be derived from the Indian game chaturanga sometime before the 7th century. Chaturanga is also the likely ancestor of the Eastern strategy games xiangqi, janggi, and shogi. Chess reached Europe by the 9th century, due to the Umayyad conquest of Hispania. The pieces assumed their current powers in Spain in the late 15th century; the modern rules were standardized in the 19th century.'

    }

  ]

  sendsports(sport){
    this.sportsdata =sport;
  }

  ngOnInit() {
  }

}
