import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import Flight from '../Entity/Flight';

const BASE_URL="http://localhost:7091";

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  createFlight(flight: {flightNo:Number;fromPlace: string;toPlace: string;startDateTime: string;
    endDateTime: string;scheduledDays: string;instrumentName: string;busiSeats:number;nonbusSeats:number;flightModel: string;
    ticketCost:number;noOfRows:number;
  }) {
    return this.http.post(BASE_URL+"/addflight", flight);
  }

  getAllFlightDetails(){
    return this.http.get(BASE_URL+"/getAllFlights");
  }
  constructor(public http:HttpClient) { }
}
