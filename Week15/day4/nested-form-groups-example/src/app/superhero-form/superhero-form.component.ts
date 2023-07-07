import { Component } from '@angular/core';

// import the FormGroup and FormBuilder classes
import { FormGroup, FormBuilder } from '@angular/forms';
import { Person } from '../person';
import { HeroFormService } from '../hero-form.service';
import { AlterEgo } from '../alter-ego';

@Component({
  selector: 'app-superhero-form', // use this as an html tag in app.component.html
  templateUrl: './superhero-form.component.html',
  styleUrls: ['./superhero-form.component.css']
})
export class SuperheroFormComponent {

  /** JSON from our backend REST API
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

  // create a FormGroup object to track the state of the user inputs
  heroForm: FormGroup = this.builder.group({
    name: '',
    job: '',
    alterEgo: this.builder.group({
                  id: '',
                  name: '',
                  superpowers: '',
                  weakness: ''
               })
      });

  // inject the FormBuilder and the HeroFormService
  constructor(private builder: FormBuilder, private service: HeroFormService) { }

  onSubmit() {
    // get the values from the form using .get('control-name')?.value
    let realName = this.heroForm.get('name')?.value;
    let job = this.heroForm.get('job')?.value;
    let alterEgoName = this.heroForm.get('alterEgo.name')?.value;
    let superpowers = this.heroForm.get('alterEgo.superpowers')?.value;
    let weakness = this.heroForm.get('alterEgo.weakness')?.value;

    // create an instance of a Person
    let hero = new Person(0, realName, job, 
      new AlterEgo(0, alterEgoName, superpowers, weakness)
    );
    
    // save the Person to the database (don't need to do anything w/return value)
    this.service.save(hero).subscribe(data => console.log(data));

    // clear the form
    this.heroForm.reset();
  }


}
