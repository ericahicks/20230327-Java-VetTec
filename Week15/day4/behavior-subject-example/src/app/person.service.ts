import { Injectable } from '@angular/core';
import { Person } from './person';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  // I need a regular variable of type person
  public person: Person = new Person('unknown', '#FFFFFF');

  // I need a BehaviorSubject to wrap the person object, 
  // so components can subscribe
  subject = new BehaviorSubject(this.person); 

  constructor() { }

  // changeFavoriteColor(color: string): void {
  //   this.person.favoriteColor = color;
  //   this.subject.next(this.person);
  // }

  update(person: Person) {
    this.person = person;
    this.subject.next(this.person);
  }

}