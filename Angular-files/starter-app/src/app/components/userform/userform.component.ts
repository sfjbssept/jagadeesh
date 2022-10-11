import { Component, OnInit } from '@angular/core';
import Student from 'src/app/Entity/Student';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

student: Student = new Student();


  username:String= "";
  age:number=0;
  title = 'hello world';
  desc:String = "You use the Angular CLI to create projects, generate application and library code, and perform a variety of ongoing development tasks such as testing, bundling, and deployment"
  save() {
    console.log("the user's name is " + this.username + " whos age is "+ this.age);
  }

  constructor() { }

  ngOnInit(): void {


    
  }

}
