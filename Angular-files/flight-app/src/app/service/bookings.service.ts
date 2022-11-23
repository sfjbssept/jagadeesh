import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const BASE_URL="http://localhost:7093";

@Injectable({
  providedIn: 'root'
})
export class BookingsService {
  createBooking(booking: { id:Number;user: string;flightid:Number;seatcount:Number}) {
    return this.http.post(BASE_URL+"/user/addBooking", booking);
  }
  constructor(public http:HttpClient) { }
}
