import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import {FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ObservablesComponent } from './observables/observables.component';
import { NewsComponent } from './news/news.component';
//import { MoviesComponent } from './movies/movies.component';
import { HeaderComponent } from './header/header.component';
import { ReceipesComponent } from './receipes/receipes.component';
import { ReceipesdetailsComponent } from './receipesdetails/receipesdetails.component';
import { HomeComponent } from './home/home.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ObservablesComponent,
    NewsComponent,
    // MoviesComponent,
    HeaderComponent,
    ReceipesComponent,
    ReceipesdetailsComponent,
    HomeComponent,
    PagenotfoundComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'home', component : HomeComponent},
      {path:'login', component : LoginComponent},
      {path:'register', component : RegisterComponent},
      {path:'observables', component : ObservablesComponent},
      {path:'receipes', component : ReceipesComponent},
      {path:'news', component : NewsComponent},
      // {path:'movies', component : MoviesComponent},
      {path:'**', component : PagenotfoundComponent},
])


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
