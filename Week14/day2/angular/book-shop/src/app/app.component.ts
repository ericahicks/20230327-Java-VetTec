import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Book Shop'; // template literals allow us to dislay this field in the html

  myMethod() {
    console.log("clicked");
  }

}
