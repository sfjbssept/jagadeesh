import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { AddAirlineComponent } from './components/add-airline/add-airline.component';
import { ContactComponent } from './components/contact/contact.component';
import { FlightBookingComponent } from './components/flight-booking/flight-booking.component';
import { FlightDetailsComponent } from './components/flight-details/flight-details.component';
import { HomeComponent } from './components/home/home.component';
import { UserComponent } from './components/user/user.component';
import Flight from './Entity/Flight';

const routes: Routes = [{ path: "home", component: HomeComponent }, 
{ path: "register", component: UserComponent }, 
{ path: "contact", component: ContactComponent }, 
{ path: "about", component: AboutComponent }, 
{ path: "flightdetails", component: FlightDetailsComponent },
{path: "addAirlines", component: AddAirlineComponent},
{path: "flightBooking", component: FlightBookingComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }