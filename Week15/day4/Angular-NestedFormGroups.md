# Angular Nested Form Groups

When using Reactive forms in Angular, the component.ts needs a FormGroup object that tracks the 
changes of the user input fields in our component.html.

FormGroups can be nested.

For example, a user profile might have name, dob, phone, email, and address where address itself has streetAddress, city, state, zip.

```
{
      name: '',
      dob: '',
      phone: '',
      email: '',
      address: {
        streetAddress: '',
        city: '',
        state: '',
        zip: ''
      }
}
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

  constructor(private fb: FormBuilder) { }
    
  
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

4. Make sure you have your model classes and your service class set up. MAKE SURE THIS MODEL'S PROPERTIES MATCH THE BACKEND'S MODEL'S PROPERTIES.

  a. Model classes

  ```
  export class Person {
    name: string;
    dob: string;
    phone: string;
    email: string;
    address: Address;
  }

  export class Address {
    streetAddress: string;
    city: string;
    state: string;
    zip: string;
  }
 
  ```

  b. Service class

  `ng generate service Person --skip-tests` // note Angular adds .service so we don't need Service in the name

  in app.modules.ts import the HttpClientModule from @anular/common/http

  ```
    import { NgModule } from '@angular/core';
    import { BrowserModule } from '@angular/platform-browser';
    import { HttpClientModule } from '@angular/common/http';

    @NgModule({
      imports: [
        BrowserModule,
        // import HttpClientModule after BrowserModule.
        HttpClientModule,
      ],
      declarations: [
        AppComponent,
      ],
      bootstrap: [ AppComponent ]
    })
    export class AppModule {}
  ```

  In person.service.ts:

  ```
  import { Injectable } from '@angular/core';
  import { HttpClient, HttpHeaders } from '@angular/common/http';

  @Injectable()
  export class PersonService {
    constructor(private http: HttpClient) { }
  

     save(person: Person): Observable<Person> {
        return this.http.post<Person>('http://localhost:8080/v1/people', Person, {headers: new HttpHeaders({'Content-Type': 'application/json'})});
     }
}
  ```

5. In the component class, set up a method stub for onSubmit()

```
onSubmit() {
  // Grab all the fields from the inputs (notice the nested form group's controls names are address.whatever)
  let name = this.personForm.get('name')?.value;
  let zip = this.personForm.get('address.zip')?.value;

  // TODO create an object of type Person
  let person: Person;
  person = ...
  // TODO call the PersonService class's .save(person) method and .subscribe(data => console.log(data))
}
```

In order to get the value from each form control, you need to call

```
   name: string = this.personForm.get('name')?.value;
```

6. In the form html template at the event binding (ngSubmit)="onSubmit()";

```
<form (ngSubmit)="onSubmit() formGroup="personForm >
...
</form>
```

7. Add a .reset() in the onSubmit method in the component.ts file

```
onSubmit() {
  ...
  this.personForm.reset();
}
```

8. Test it!

Make sure your backend had cors enabled

```
@CrossOrigin(orgins = "*") // this is for allowing all
@RestController
class PersonController {
  ...
}
```

9. For POST mappings, make sure the method saving the nested object and the object itself is annotated
   with 
   ```
   @Transanctional
   public Person save(Person person) {
    // make sure you save the nested object first 
    Address a = addressRepo.save(person.getAddress());
    // then associate the persisted address object with the person
    person.setAddress(a);
    // finally you can save the person object itself
    return personRepo.save(person);
   }
   ```
