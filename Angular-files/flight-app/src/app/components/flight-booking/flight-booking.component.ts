import { Component, OnInit } from '@angular/core';
import Booking from 'src/app/Entity/Booking';
import { BookingsService } from 'src/app/service/bookings.service';

@Component({
  selector: 'app-flight-booking',
  templateUrl: './flight-booking.component.html',
  styleUrls: ['./flight-booking.component.css']
})
export class FlightBookingComponent implements OnInit {
  booking : Booking = new Booking();
  save() {
    const observables = this.bookingService.createBooking(this.booking);
    observables.subscribe(
      (response: any) => {
        console.log(response);
      },
      function (error: any) {
        console.log(error);
        alert('Something went wrong try again!');
      }
    );
  }

  constructor(public bookingService: BookingsService) {}

  ngOnInit(): void {}

}
