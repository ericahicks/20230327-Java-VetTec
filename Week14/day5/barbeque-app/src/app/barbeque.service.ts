import { Injectable } from '@angular/core';
import { Barbeque } from './barbeque';
import { HttpClient } from '@angular/common/http'
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BarbequeService {

  barbequeItems: Barbeque[] = []; // TODO behavior subject to subscribe to this instead

  // TODO have multiple components subscribe to the bbqPubSub to get live-updates between components
  bbqPubSub: BehaviorSubject<Barbeque[]> = new BehaviorSubject(this.barbequeItems); 


  url: string = "http://localhost:8080/barbeque" // TODO put this in an environment file

  constructor(private httpClient: HttpClient) { }

  findAll(): Observable<Barbeque[]> { 
    return this.httpClient.get<Barbeque[]>(this.url);
  }

  save(item: Barbeque): Observable<Barbeque> {
    return this.httpClient.post<Barbeque>(this.url, item); // return the item created because I dont know what Id it will choose -- needs to have ID field
  }
}

