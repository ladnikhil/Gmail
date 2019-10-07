import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';
import { FormsModule} from '@angular/forms';
import { ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SportsComponent } from './sports/sports.component';
import { SportsdetailsComponent} from './sportsdetails/sportsdetails.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { from } from 'rxjs';
import { FirebaseComponent } from './firebase/firebase.component';
import { UsersComponent } from './users/users.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,SportsComponent,SportsdetailsComponent, LoginComponent, RegisterComponent, FirebaseComponent, UsersComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'sports',component: SportsComponent},
      {path:'login',component: LoginComponent},
      {path:'register',component: RegisterComponent}
    ]),FormsModule,ReactiveFormsModule,HttpClientModule
     
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
