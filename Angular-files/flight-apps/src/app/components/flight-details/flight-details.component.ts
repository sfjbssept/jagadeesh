import { Component, OnInit } from '@angular/core';
import Flight from 'src/app/Entity/Flight';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-flight-details',
  templateUrl: './flight-details.component.html',
  styleUrls: ['./flight-details.component.css']
})
export class FlightDetailsComponent implements OnInit {
  flights: Flight[] = [];

  title : string = "Flight Details";
  constructor(private adminService : AdminService) { }

  ngOnInit(): void {
    const data = this.adminService.getAllFlightDetails();
    data.subscribe((response) => {
      console.log(response);
      this.flights = response as Flight[];
    });
  }

}
