import { Component } from '@angular/core';
import { PersonService } from '../person.service';
import { Person } from '../person';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  model: Person = new Person('', '');

  constructor(private service: PersonService) { }

  onSubmit() {
    // tell the PersonService that the Person object needs to get updated
    this.service.update(this.model);
  }

}
