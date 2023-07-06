# Angular Nested Form Groups

When using Reactive forms in Angular, the component.ts needs a FormGroup object that tracks the 
changes of the user input fields in our component.html.

FormGroups can be nested.

For example, a user profile might have name, dob, phone, email, and address where address itself has streetAddress, city, state, zip.

```

```

## Steps

0. In your app.modules.ts import the Module

```
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  imports: [
    // other imports ...
    ReactiveFormsModule
  ],
})
export class AppModule { }
```

1. Import the necessary modules for ReactiveForms (we will also use FormBuilder instead of calling the FormGroup constructor directly)

```
import { FormGroup, FormBuilder } from '@angular/forms';
```

2. In the component class, set up the FormBuilder object. (Note, we need to inject the FormBuilder instance to create our FormGroups)

```
export class PersonProfileComponent {
  personForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.personForm = this.fb.group({
      name: '',
      dob: '',
      phone: '',
      email: '',
      address: this.fb.group({
        streetAddress: '',
        city: '',
        state: '',
        zip: ''
      })
    });
  }
}

```

3. In the component template, set up your form. 

```
<form [formGroup]="personForm">
  <div>
    <label for="name">Name:</label>
    <input type="text" id="name" formControlName="name">
  </div>
  
  <div>
    <label for="dob">Date of Birth:</label>
    <input type="text" id="dob" formControlName="dob">
  </div>
  
  <div>
    <label for="phone">Phone:</label>
    <input type="text" id="phone" formControlName="phone">
  </div>
  
  <div>
    <label for="email">Email:</label>
    <input type="text" id="email" formControlName="email">
  </div>
  
  <div formGroupName="address">
    <h3>Address</h3>
    <div>
      <label for="streetAddress">Street Address:</label>
      <input type="text" id="streetAddress" formControlName="streetAddress">
    </div>
  
    <div>
      <label for="city">City:</label>
      <input type="text" id="city" formControlName="city">
    </div>
  
    <div>
      <label for="state">State:</label>
      <input type="text" id="state" formControlName="state">
    </div>
  
    <div>
      <label for="zip">ZIP:</label>
      <input type="text" id="zip" formControlName="zip">
    </div>
  </div>
</form>

```

(Note you can use Bootstrap's styles for [FormGrid](https://getbootstrap.com/docs/5.3/forms/layout/#form-grid) for styling)

```
<form [formGroup]="personForm">
  <div class="row">
    <div class="col-md-6">
      <label for="name">Name:</label>
      <input type="text" id="name" formControlName="name" class="form-control">
    </div>
  
    <div class="col-md-6">
      <label for="dob">Date of Birth:</label>
      <input type="text" id="dob" formControlName="dob" class="form-control">
    </div>
  </div>
  
  <div class="row">
    <div class="col-md-6">
      <label for="phone">Phone:</label>
      <input type="text" id="phone" formControlName="phone" class="form-control">
    </div>
  
    <div class="col-md-6">
      <label for="email">Email:</label>
      <input type="text" id="email" formControlName="email" class="form-control">
    </div>
  </div>
  
  <div class="row">
    <div class="col-md-12">
      <div formGroupName="address" class="form-group">
        <h3>Address</h3>
        
        <div class="row">
          <div class="col-md-6">
            <label for="streetAddress">Street Address:</label>
            <input type="text" id="streetAddress" formControlName="streetAddress" class="form-control">
          </div>
  
          <div class="col-md-6">
            <label for="city">City:</label>
            <input type="text" id="city" formControlName="city" class="form-control">
          </div>
        </div>
  
        <div class="row">
          <div class="col-md-6">
            <label for="state">State:</label>
            <input type="text" id="state" formControlName="state" class="form-control">
          </div>
  
          <div class="col-md-6">
            <label for="zip">ZIP:</label>
            <input type="text" id="zip" formControlName="zip" class="form-control">
          </div>
        </div>
      </div>
    </div>
  </div>
</form>
```

