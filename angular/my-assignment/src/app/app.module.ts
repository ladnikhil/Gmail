import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{ RouterModule } from '@angular/router';


import { AppComponent } from './app.component';
import { CarsComponent } from './cars/cars.component';
import { CarsDetailsComponent } from './cars-details/cars-details.component';
import { ReceipesComponent } from './receipes/receipes.component';
import { ReceipesDetailsComponent } from './receipes-details/receipes-details.component';
import { NewsComponent } from './news/news.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    CarsDetailsComponent,
    ReceipesComponent,
    ReceipesDetailsComponent,
    NewsComponent,
    NewsDetailsComponent,
    MobilesComponent,
    MobileDetailsComponent,
    HeaderComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '',component: HomeComponent},
      { path: 'header', component: HeaderComponent},
      { path: 'cars', component: CarsComponent},
      { path: 'receipes', component: ReceipesComponent},
      { path: 'news', component: NewsComponent},
      { path: 'mobiles', component: MobilesComponent},
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
