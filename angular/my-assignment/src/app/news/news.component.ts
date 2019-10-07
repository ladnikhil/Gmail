import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  newsdata:any = '';

  news = [
    {
      name: 'sports',
      img: 'https://image.shutterstock.com/image-photo/cricket-ball-resting-on-bat-260nw-114007321.jpg',
      description:'Cricket is a bat-and-ball game played between two teams of eleven players on a field at the centre of which is a 20-metre (22-yard) pitch with a wicket at each end, each comprising two bails balanced on three stumps. The batting side scores runs by striking the ball bowled at the wicket with the bat, while the bowling and fielding side tries to prevent this and dismiss each player (so they are "out"). Means of dismissal include being bowled, when the ball hits the stumps and dislodges the bails, and by the fielding side catching the ball after it is hit by the bat, but before it hits the ground. When ten players have been dismissed, the innings ends and the teams swap roles. The game is adjudicated by two umpires, aided by a third umpire and match referee in international matches. They communicate with two off-field scorers who record the match'
      
    },

    {
      name: 'politics',
      img: 'https://image.shutterstock.com/image-photo/newspaper-headline-world-politics-260nw-777690526.jpg',
      description:'Politics is a multifaceted word. It has a set of fairly specific meanings that are descriptive and nonjudgmental (such as "the art or science of government" and "political principles"), but does often colloquially carry a negative connotation.[1][5][6] The word has been used negatively for many years: the British national anthem as published in 1745 calls on God to "Confound their politics",[7] and the phrase "play politics", for example, has been in use since at least 1853, when abolitionist Wendell Phillips declared: "We do not play politics; anti-slavery is no half-jest with us.'

    },

    {
      name: 'entertainment',
      img: 'https://media-public.canva.com/MADatXki3Gw/1/thumbnail_large.jpg',
      description:'Entertainment is a form of activity that holds the attention and interest of an audience, or gives pleasure and delight. It can be an idea or a task, but is more likely to be one of the activities or events that have developed over thousands of years specifically for the purpose of keeping an audience'

    },

    {
      name: 'business',
      img: 'https://image.shutterstock.com/image-photo/business-people-shaking-hands-finishing-260nw-420967090.jpg',
      description:'Sole proprietorship: A sole proprietorship, also known as a sole trader, is owned by one person and operates for their benefit. The owner operates the business alone and may hire employees. A sole proprietor has unlimited liability for all obligations incurred by the business, whether from operating costs or judgments against the business. All assets of the business belong to a sole proprietor, including, for example, a computer infrastructure, any inventory, manufacturing equipment, or retail fixtures, as well as any real property owned by the sole proprietor.'

    },

    {
      name: 'world',
      img: 'https://image.shutterstock.com/image-photo/businessman-using-laptop-close-on-260nw-416963155.jpg',
      description:'The world is the planet Earth and all life on it, including human civilization.[1] In a philosophical context, the "world" is the whole of the physical Universe, or an ontological world (the "world" of an individual). In a theological context, the world is the material or the profane sphere, as opposed to the celestial, spiritual, transcendent or sacred spheres. "End of the world" scenarios refer to the end of human history, often in religious contexts.'

    }
  ]
  constructor() { }

  
  sendnews(n){
    this.newsdata = n;
  }

  ngOnInit() {
  }

}
