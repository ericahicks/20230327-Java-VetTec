import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs'
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ChildrenService {

  dummyData = ["Suzie", "Robert", "Bobby Jr", "Baby Girl", "Timmy"];

  // url: string  = environment.apiUrl; // "localhost:8080/books";

  constructor(private http: HttpClient) { }

  getDummyData(): Observable<string[]> { // observables allow us to asynchronusly get data by subscribing to them
    // just like in Java when we do 
    // new ArrayList<String>(Array.asList(1, 2 , 3))
    return of<string[]>(this.dummyData); // get me an observable of strings from this data
    // return this.http.get<string[]>(this.url);
  }
}
