import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { NewsComponent } from './news/news.component';
import { MovieComponent } from './movie/movie.component';
import { FirebaseComponent } from './firebase/firebase.component';
import { UsersComponent } from './users/users.component';
import { CustomPipe } from './custom.pipe';
import { ReducePipe } from './reduce.pipe';
//import { FilterPipe } from './filter.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    NewsComponent,
    MovieComponent,
    FirebaseComponent,
    UsersComponent,
    CustomPipe,
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path:'', component: HomeComponent},
      { path:'header', component: HeaderComponent},
      { path:'news',component: NewsComponent},
      { path:'movie',component: MovieComponent},
      { path:'firebase',component: FirebaseComponent},
      { path: 'users',component: UsersComponent}
    ]),HttpClientModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
