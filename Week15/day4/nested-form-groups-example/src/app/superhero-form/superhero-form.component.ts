import { Component } from '@angular/core';

import { FormGroup, FormBuilder } from '@angular/forms';

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

  formGroup: FormGroup = this.builder.group({
    id: '',
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

}
