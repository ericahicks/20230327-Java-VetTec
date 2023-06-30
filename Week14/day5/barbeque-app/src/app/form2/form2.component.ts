import { Component } from '@angular/core';
import { Barbeque } from '../barbeque';
import { BarbequeService } from '../barbeque.service';
import { FormGroup, FormControl, Validators, FormBuilder, FormArray } from '@angular/forms'


@Component({
  selector: 'app-form2',
  templateUrl: './form2.component.html',
  styleUrls: ['./form2.component.css']
})
export class Form2Component {

  // this will hold the form data
  // model: Barbeque = new Barbeque();

  // myForm: FormGroup = new FormGroup({
  //   meatType: new FormControl('', [Validators.required]),
  //   sauceType: new FormControl(''),
  //   cookingStyle: new FormControl('', [Validators.required, Validators.min(1)]),
  //   cookingTime: new FormControl(0)
  // })

  myForm = this.fb.group({
    meatType: ['', Validators.compose([Validators.required, Validators.minLength(2)])],
    sauceType: [''],
    cookingStyle: [''],
    cookingTime: ['', Validators.compose([Validators.required, Validators.min(1), Validators.max(18)])]
  });


  constructor(private service: BarbequeService, private fb: FormBuilder) {  }

  onSubmit() { // no parameter bc the data is at the class level
    let item = new Barbeque(0, this.meatType.value!, this.sauceType.value!, this.cookingStyle.value!, parseInt(this.cookingTime.value!));
    this.service.save(item).subscribe((data) =>
    {
      console.log(data);

    });
  }

  // ? means optional chaining so return undefined if not there
  // ! means trust me there's going to be a value here
  get meatType() {
    return this.myForm.get('meatType')!;
  }

  get sauceType() {
    return this.myForm.get('sauceType')!;
  }

  get cookingStyle() {
    return this.myForm.get('cookingStyle')!;
  }

  get cookingTime() {
    return this.myForm.get('cookingTime')!;
  }

}
