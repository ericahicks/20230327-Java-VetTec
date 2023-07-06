import { Component, OnInit } from '@angular/core';
import { PersonService } from '../person.service';
import { Person } from '../person';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {

  person: Person = new Person('', '');

  constructor(private service: PersonService) {

  }

  ngOnInit(): void {
      this.service.subject.subscribe(data => this.person = data);
  }

  sayHello() {
    console.log("hello " + this.person.name);
  }
}
