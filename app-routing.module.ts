import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DetailsComponent } from './details/details.component';
import { HomeComponent } from './home/home.component';
import { MoviesComponent } from './movies/movies.component';
import { PaymentComponent } from './payment/payment.component';
import { TicketComponent } from './ticket/ticket.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { UserregistrationComponent } from './userregistration/userregistration.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { EditmovieComponent } from './editmovie/editmovie.component';
import { MoviesadminComponent } from './moviesadmin/moviesadmin.component';
import { MoviesuserComponent } from './moviesuser/moviesuser.component';

const routes: Routes = [
{"path":"home",component:HomeComponent},
{"path":"aboutus",component:AboutUsComponent},
{"path":"contactus",component:ContactUsComponent},
{"path":"movies",component:MoviesComponent},
{"path":"details",component:DetailsComponent},
{"path":"payment",component:PaymentComponent},
{"path":"ticket",component:TicketComponent},
{"path":"userregistrtion",component:UserregistrationComponent},
{"path":"userlogin",component:UserloginComponent},
{"path":"adminregistrtion",component:AdminregistrationComponent},
{"path":"adminlogin",component:AdminloginComponent},
{"path":"addmovie",component:AddmovieComponent},
{"path":"editmovie/:id",component:EditmovieComponent},
{"path":"movielistadmin",component:MoviesadminComponent},
{"path":"movielistuser",component:MoviesuserComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
