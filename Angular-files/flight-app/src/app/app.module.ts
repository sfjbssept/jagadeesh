import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutComponent } from './components/about/about.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AddAirlineComponent } from './components/add-airline/add-airline.component';
import { HomeComponent } from './components/home/home.component';
import { ContactComponent } from './components/contact/contact.component';
import { UserComponent } from './components/user/user.component';
import { FlightDetailsComponent } from './components/flight-details/flight-details.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FlightBookingComponent } from './components/flight-booking/flight-booking.component';



@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    NavbarComponent,
    AddAirlineComponent,
    HomeComponent,
    ContactComponent,
    UserComponent,
    FlightDetailsComponent,
    FlightBookingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
