import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterModule} from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { SportsComponent } from './sports/sports.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { SportsDetailsComponent } from './sports-details/sports-details.component';
import { NewsComponent } from './news/news.component';
import { ScienceComponent } from './science/science.component';
import { GeneralComponent } from './general/general.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { WorldComponent } from './world/world.component';
import { GithubComponent } from './github/github.component';
import { TypicodeComponent } from './typicode/typicode.component';
import { FirebaseComponent } from './firebase/firebase.component';
import { UsersComponent } from './users/users.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    SportsComponent,
    LoginComponent,
    RegistrationComponent,
    PagenotfoundComponent,
    SportsDetailsComponent,
    NewsComponent,
    ScienceComponent,
    GeneralComponent,
    EntertainmentComponent,
    WorldComponent,
    GithubComponent,
    TypicodeComponent,
    FirebaseComponent,
    UsersComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule,HttpClientModule,
    
    RouterModule.forRoot([
      // { path:'',component : HomeComponent},
      // { path:'home',component : HeaderComponent},
      // { path:'header',component : HomeComponent},
      // { path:'sports',component : SportsComponent},
      // { path:'login',component : LoginComponent},
      // { path:'registration',component : RegistrationComponent},
      // { path:'**',component : PagenotfoundComponent},
      { path:'news',component: NewsComponent},
      { path:'header',component : HeaderComponent},
      { path: 'world',component : WorldComponent},
      { path:'github',component : GithubComponent},
      { path:'typicode',component : TypicodeComponent},
      { path:'firebase',component : FirebaseComponent},
      { path:'users',component: UsersComponent}
      ])
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
