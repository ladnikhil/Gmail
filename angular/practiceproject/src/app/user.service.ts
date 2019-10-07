import  { Injectable } from '@angular/core';

@Injectable({
    providedIn: "root"
})

export class UserService {
  details(){
     return [
        {
            name: 'nikhil',
            company: 'UST Global'
        },

        {
            name: 'sagar',
            company: 'UST Global'
        },

        {
            name: 'sid',
            company: 'UST Global'
        }
    ]
}
}
