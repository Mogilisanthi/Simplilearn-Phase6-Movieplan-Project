import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClient, HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { HomeComponent } from './home/home.component';
import { MoviesComponent } from './movies/movies.component';
import { TicketComponent } from './ticket/ticket.component';
import { PaymentComponent } from './payment/payment.component';
import { DetailsComponent } from './details/details.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { UserregistrationComponent } from './userregistration/userregistration.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { EditmovieComponent } from './editmovie/editmovie.component';
import { MoviesadminComponent } from './moviesadmin/moviesadmin.component';
import { MoviesuserComponent } from './moviesuser/moviesuser.component';

@NgModule({
  declarations: [
    AppComponent,
    AboutUsComponent,
    ContactUsComponent,
    HomeComponent,
    MoviesComponent,
    TicketComponent,
    PaymentComponent,
    DetailsComponent,
    UserregistrationComponent,
    UserloginComponent,
    AdminregistrationComponent,
    AdminloginComponent,
    AddmovieComponent,
    EditmovieComponent,
    MoviesadminComponent,
    MoviesuserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    Ng2SearchPipeModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
