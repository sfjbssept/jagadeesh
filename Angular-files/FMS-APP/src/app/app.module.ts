import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutComponent } from './about/about.component';
import { FlightDetailsComponent } from './components/flight-details/flight-details.component';
import { HomeComponent } from './components/home/home.component';
import { AddFlightComponent } from './components/add-flight/add-flight.component';
import { DeleteFlightComponent } from './components/delete-flight/delete-flight.component';

@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    FlightDetailsComponent,
    HomeComponent,
    AddFlightComponent,
    DeleteFlightComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
