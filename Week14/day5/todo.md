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

