import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from  '@angular/router';
import {FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddtaskComponent } from './addtask/addtask.component';
import { ViewalltaskComponent } from './viewalltask/viewalltask.component';
import { BindingComponent } from './binding/binding.component';
import { LoginComponent } from './login/login.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { RegisterComponent } from './register/register.component';
import { ReceipesComponent } from './receipes/receipes.component';
import { ReceipesdetailsComponent } from './receipesdetails/receipesdetails.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddtaskComponent,
    ViewalltaskComponent,
    BindingComponent,
    LoginComponent,
    PagenotfoundComponent,
    RegisterComponent,
    ReceipesComponent,
    ReceipesdetailsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'addtask', component : AddtaskComponent},
      {path:'viewalltask',component : ViewalltaskComponent},
      {path :'binding',component: BindingComponent},
      {path:'login' ,component : LoginComponent},
      {path: 'register' , component : RegisterComponent},
      {path:'receipes' , component: ReceipesComponent},
      {path:'**', component : PagenotfoundComponent}
    ]),FormsModule, ReactiveFormsModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
