import { Injectable } from '@angular/core';
import { Barbeque } from './barbeque';

@Injectable({
  providedIn: 'root'
})
export class BarbequeService {

  url: string = "http://localhost:8080/barbeque" // TODO put this in an environment file

  constructor() { }

  findAll() { }

  save(item: Barbeque) {

  }
}
