import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import{FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddtaskComponent } from './addtask/addtask.component';
import { EdittaskComponent } from './edittask/edittask.component';
import { ShowallComponent } from './showall/showall.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddtaskComponent,
    EdittaskComponent,
    ShowallComponent,
    

  ],
  imports: [
    BrowserModule,RouterModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'addtask', component : AddtaskComponent},
      {path:'edittask', component : EdittaskComponent},
      {path:'showall',component: ShowallComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
