# TODO

## Template Driven Form

1. `ng new app --skip-tests`

    - `npm install bootstrap@5.3.0`
    - styls.css `@import "~bootstrap/dist/css/bootstrap.css"`

2. `ng g c list --skip-tests`

3. `ng g c form --skip-tests`

4. `ng g cl myclass`

5. add model class fields

6. list html dummy table
    - div with h2 title and table
        - tr with 4 th
        - tr with 4 td

7. form html 
    - div with h2 title and form tag with 
    - divs around labels and inputs
        - 4 input fields 
        - 1 input submit

8. app html
    - delete contents
    - add title
    - add two links `<a routerLink="/list">List</a> | <a routerLink="/form" >Add</a>`
    - add <router-outlet></router-outlet>

9. app-routing
    - add two routes with path and component note path names should not have /

10. `ng generate service something`
    
11. app.modules.ts import HttpClientModule from @angular/common/http and in imports list HttpClientModule

12. service class
    - import Observable from rxjs
    - import model class
    - import HttpClient from @angular/common/http
    - add url string
    - add findAll() method that returns an Observable
    - add save(obj: Object )-- whatever type and call this.httpClient.post(url, obj)

13. list ts
    - inject service
    - ngOnInit call service
    - list.html add ngFor directive

14. form ts
    - add property to hold the form object's data
    - inject the service
    - add save() method to call the service save method passing the this.data
    - form html add [(ngModel)]="obj.field" to each input and (onSubmit)="save(); myForm.reset()" #myForm to the form

15. build the spring project
    - model class with 2 fields and jpa notations
    - repo interface (cheating here bc skipping service layer)
    - controller class with get and post mappings (don't forget the @CrossOrigin(origins = "*"))
        don't forget @RequestBody on the save parameter
        inject the repo and call findAll and save( )
    - application.properties

```spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/barbeque
spring.datasource.username=root
spring.datasource.password=yourpassword not mine!
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

16. test in postman

17. test from angular app


## Reactive Forms

1. Import the Module for Reactive Forms

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

2. Import the FormGroup and FormControl classes in the component.ts

```
import { FormGroup, FormControl } from '@angular/forms';
```
    
3. Create an instance of a FormGroup with a bunch of FormControls

```
 myForm = new FormGroup({
    field1: new FormControl(''),
    field2: new FormControl(''),
  });
```

4. Hook up the formControl with the input HTML tags

```
<form [formGroup]="myForm" (ngSubmit)="onSubmit()">

  <label for="field1">Field 1: </label>
  <input id="field1" type="text" formControlName="field1">

  <label for="field2">Field 2: </label>
  <input id="field2" type="text" formControlName="field2">

</form>
```

5. change onSubmit to send the data in the 
```
onSubmit(): MyType {
    console.log(this.myForm.value);
    this.service.save(this.myForm.value);
}
```

6. TEMPORARY let's see what is in the myForm.value using HTML template literal and pipe | json
```<div>{{ myForm.value | json }}</div>```

7. Test it

## Add validation

1. Add validation and disable the submit form in the form isn't valid
```
<input type="submit" [disabled]="!myForm.valid" value="Submit" />
```

1. Import validators in the .ts file
`import { Validators } from '@angular/forms';`

1. Add an array of validators to the FormControl

```
this.myForm = new FormGroup({
    field1: new FormControl('', [
      Validators.required,
      Validators.minLength(4)
    ])});
```

1. Add a hidden div with text to display an error message when the input value is invalid
```     <div>
            <label for="field1" class="form-label">Field 1</label>
            <input type="text" id="field1" name="field1" formControlName="field1" class="form-control" />
            <div *ngIf="field1 != null && !field1.valid && (field1.dirty || field1.touched)">
                <div [hidden]="!field1.errors?.['required']">
                    Field 1 is required
                </div>
                <div [hidden]="!field1.errors?.['maxlength']">
                    Field 1 must be be more than 4 characters
                </div>
            </div>
        </div>
        ```

## TODO Use Defaults button to show the template updates when the data state changes

1. Add a button to the HTML that says Use Defaults and has a (click)="useDefaults()"

1. In the .ts write the useDefaults() to 
```useDeafaults() {
    this.myForm.setValue({ // .patchValue( ) should be used if only updating some of the fields not all
    field1: 'default',
    field2: 'default2'
    }
  });
}
```



## TODO PutMapping and Update Item From using Reactive Form

## TODO Use FormBuilder instead of constructors to create the groups and controls 
- Builder design patter is also seen in Java a lot 
