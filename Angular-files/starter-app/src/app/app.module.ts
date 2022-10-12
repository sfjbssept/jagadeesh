import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserformComponent } from './components/userform/userform.component';
import { ContactComponent } from './components/contact/contact.component';
import { AboutComponent } from './components/about/about.component';
import { RegisterComponent } from './components/register/register.component';
import { HomeComponent } from './components/home/home.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HttpClientModule } from '@angular/common/http';
import { RegisteredstudentComponent } from './components/register/registeredstudent/registeredstudent.component';

@NgModule({
  declarations: [
    AppComponent,
    UserformComponent,
    NavbarComponent,
    ContactComponent,
    AboutComponent,
    RegisterComponent,
    HomeComponent,
    RegisteredstudentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
