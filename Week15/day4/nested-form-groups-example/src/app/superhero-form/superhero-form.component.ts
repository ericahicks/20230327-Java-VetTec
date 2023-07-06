import { Component } from '@angular/core';

import { FormGroup, FormBuilder } from '@angular/forms';
import { Person } from '../person';

@Component({
  selector: 'app-superhero-form',
  templateUrl: './superhero-form.component.html',
  styleUrls: ['./superhero-form.component.css']
})
export class SuperheroFormComponent {

  /**
   * {
    "id": 4,
    "name": "Clark Kent",
    "job": null,
    "alterEgo": {
        "id": 1,
        "name": "Superman",
        "superpowers": "flying",
        "weakness": null
    }
}
   */

  heroForm: FormGroup = this.builder.group({
    id: '0',
    name: '',
    job: '',
    alterEgo: this.builder.group({
                  id: '',
                  name: '',
                  superpowers: '',
                  weakness: ''
               })
      });

  constructor(private builder: FormBuilder) { }

  onSumbit() {
    let hero = new Person(
      this.heroForm.get('id') as number,
      this.heroForm.get('name') as string.
      this.heroForm.get('job') as string,
      new AlterEgo(this.heroForm.get('alterEgo'))
    );
    this.service.save(hero).subscribe(data => console.log(data));
  }

}
