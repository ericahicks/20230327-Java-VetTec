import { Component, OnInit } from '@angular/core';
import { Person } from '../person';
import { PersonService } from '../person.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {

  person: Person = new Person('','');

  // get access to the person service
  constructor(private service: PersonService) { }

  // subscribe to the PersonService BehaviorSubject
  ngOnInit(): void {
      this.service.subject.subscribe(data => this.person = data);
  }


}
