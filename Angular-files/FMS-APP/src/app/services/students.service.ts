import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const BASE_URL = 'http://localhost:7091';

@Injectable({
  providedIn: 'root'
})
export class StudentsService {


  getStudents() {
    return this.http.get(BASE_URL+"/getFlightDetails");
  }

  constructor(public http: HttpClient) { }
}
