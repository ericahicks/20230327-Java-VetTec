import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs'
import { Person } from './person';
import { AlterEgo } from './alter-ego';

@Injectable({
  providedIn: 'root'
})
export class HeroFormService {

  currentPerson: Person = new Person(0, '', '', new AlterEgo(0, '', '', ''));

  constructor(private httpClient: HttpClient) { }

  save(person: Person): Observable<Person> { // TODO move the url into an environment file and read it in here
    return this.httpClient.post<Person>('http://localhost:8080/people', person, {headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }
}
