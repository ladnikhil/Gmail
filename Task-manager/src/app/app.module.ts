import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from  '@angular/router';
import {FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddtaskComponent } from './addtask/addtask.component';
import { ViewalltaskComponent } from './viewalltask/viewalltask.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddtaskComponent,
    ViewalltaskComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'addtask', component : AddtaskComponent},
      {path:'viewalltask',component : ViewalltaskComponent}
    ]),FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
