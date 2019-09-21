import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikedetailsComponent } from './bikedetails/bikedetails.component';
import { HeaderComponent } from './header/header.component';


@NgModule({
  declarations: [
    AppComponent,
    BikesComponent,
    BikedetailsComponent,
    HeaderComponent
    
  ],
  imports: [

    
    BrowserModule,
    RouterModule.forRoot([
      {path:'bikes', component : BikesComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
