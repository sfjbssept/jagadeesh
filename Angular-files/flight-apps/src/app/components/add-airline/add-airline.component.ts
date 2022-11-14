import { Component, OnInit } from '@angular/core';
import Flight from 'src/app/Entity/Flight';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-add-airline',
  templateUrl: './add-airline.component.html',
  styleUrls: ['./add-airline.component.css']
})
export class AddAirlineComponent implements OnInit {

  flight : Flight = new Flight();
  save() {
    const observables = this.adminService.createFlight(this.flight);
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

  constructor(public adminService: AdminService) {}

  ngOnInit(): void {}

}
