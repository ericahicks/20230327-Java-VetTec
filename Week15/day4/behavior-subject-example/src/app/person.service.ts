import { Injectable } from '@angular/core';
import { Person } from './person';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  // I need a regular variable of type person
  public person: Person = new Person('unknown', '#000000');

  // I need a BehaviorSubject to wrap the person object, 
  // so components can subscribe
  subject = new BehaviorSubject(this.person); 

  constructor() { }

  // changeFavoriteColor(color: string): void {
  //   this.person.favoriteColor = color;
  //   this.subject.next(this.person);
  // }

  update(person: Person) {
    // TODO update in the database the name
    this.person.name = person.name;
    this.person.favoriteColor = person.favoriteColor;

    // THIS IS THE IMPORTANT METHOD TO PUBLISH THE CHANGES TO
    // THE SUBSCRIBERS
    this.subject.next(this.person);
  }

  get() {
    // TODO pull from database (this would be used on startup or login etc.)
  }

}