import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import{FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikedetailsComponent } from './bikedetails/bikedetails.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { NewsComponent } from './news/news.component';
import { MoviesComponent } from './movies/movies.component';
import { FirebaseComponent } from './firebase/firebase.component';
import { UsersComponent } from './users/users.component';

import { EmployeeComponent } from './employee/employee.component';


@NgModule({
  declarations: [
    AppComponent,
    BikesComponent,
    BikedetailsComponent,
    HeaderComponent,
    LoginComponent,
    NewsComponent,
    MoviesComponent,
    FirebaseComponent,
    UsersComponent,
    EmployeeComponent
    
  ],
  imports: [

    
    BrowserModule,
    RouterModule.forRoot([
      {path:'bikes', component : BikesComponent},
      {path:'login', component : LoginComponent},
      {path:'news',component: NewsComponent},
      {path:'movies',component : MoviesComponent},
      {path:'firebase',component : FirebaseComponent},
      {path:'users',component : UsersComponent},
      {path:'employee',component : EmployeeComponent}


    ]),FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
