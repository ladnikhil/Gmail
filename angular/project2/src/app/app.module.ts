import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';  // imported it for routing
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { ObservablesComponent } from './observables/observables.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { NewsComponent } from './news/news.component';
import { TaskmanagerComponent } from './taskmanager/taskmanager.component';
import { MovieComponent } from './movie/movie.component';
import { GetallComponent } from './getall/getall.component';
import { GetComponent } from './get/get.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ObservablesComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    NewsComponent,
    TaskmanagerComponent,
    MovieComponent,
    GetallComponent,
    GetComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path:'',component :HomeComponent},
      { path:'observables', component: ObservablesComponent},
      {path:'login' , component :LoginComponent},
      {path:'register' , component :RegisterComponent},
      {path:'taskmanager' , component :TaskmanagerComponent},
      {path:'news' , component :NewsComponent},
      {path:'movie' , component :MovieComponent},
      {path:'getall' , component :GetallComponent},

    ]),HttpClientModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
