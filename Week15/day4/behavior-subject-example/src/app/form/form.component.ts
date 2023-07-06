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
  
  tempChanges: Person = new Person('', '');

  constructor(private service: PersonService) { }

  onSubmit() {
    // update the main model to contain the form values
    this.model.name = this.tempChanges.name;
    this.model.favoriteColor = this.tempChanges.favoriteColor;

    console.log("temp:", this.tempChanges);
    console.log("model:", this.model);

    // tell the PersonService that the Person object needs to get updated
    this.service.update(this.model);

    // this.model.name = "";
    // this.model.favoriteColor = "";
  }

}
