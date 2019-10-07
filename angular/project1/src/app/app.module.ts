import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';  // impoerted it for routing
import { FormsModule } from '@angular/forms';   // imported it for templatedriven forms


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { UsersComponent } from './users/users.component';
import { RegisterComponent } from './register/register.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    UsersComponent,
    RegisterComponent,
    PagenotfoundComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([               // here we have gave all routing components
      {path: '', component : HomeComponent},
      {path: 'about', component: AboutComponent},
      {path: 'register',component : RegisterComponent },
      {path: 'users',component : UsersComponent },
      {path: '**',component : PagenotfoundComponent }     // for different url other then this components

    ]),FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
