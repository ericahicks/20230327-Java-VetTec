"use strict";
/*
BAD  - each field must have a value or be
       assigned a value in the constructor
class Party {
    host: String;
}
*/
/*
BAD - each field must be declared outsid teh constructor
class Pary {
    constructor(host: string) {
        this.host = host;
    }
}
*/
// word wrap alt-z
/*
/*
GOOD but verbose

class Party {
    constructor(host) {
        this.host = host;
    }
}
let friyay = new Party("Erica");
console.log(friyay);
*/
/*
GOOD Shortcut
*/
class Party {
    // access modifer name: type inside the ( )
    constructor(host, theme) {
        this.host = host;
        this.theme = theme;
        this.host = host;
        this.guestCount = 0;
        this.theme = theme;
    }
    invite(name) {
        console.log(name + " you are invited to " + this.host + "'s party!");
    }
    // this is a getter it automatically generated a field
    // on my class using the method name as a property name
    get music() {
        console.log("run some code here whenever this is accessed");
        return this.music;
    }
    // this is a setter 
    // it will run the method body every time someone
    // tries to set the field music
    // using myobj.music = "blank"
    set music(name) {
        console.log("running a setter method!!!");
        if (name) {
            this.music = name;
        }
    }
}
let friyay = new Party("Erica", "4th of July");
console.log(friyay);
console.log(friyay.host);
console.log(friyay.guestCount); // public readonly so allowed!
// friyay.guestCount = 1; // public readonly not allowed
/*
 ACCESS MODIFIERS
 - public = have access to it outside the class
 - private = don't have access to it outside the class
 - public readonly = can get the value but not set it
 - protected = accessible inside the class and in child classes
*/
class HolidayParty extends Party {
    describe() {
        console.log(this.theme + " party");
    }
}
let fourthJulyParty = new HolidayParty("Erica", "4th of July");
// fourthJulyParty.theme;
fourthJulyParty.describe();
// console.log(fourthJulyParty.myMethod);
// getters and setters let me run code
// whenever this field is accessed
// TODO debug where I created the infinite loop
// fourthJulyParty.music = "country";
class Book {
    constructor(title) {
        this._title = title;
    }
    get title() {
        return this._title;
    }
    set title(title) {
        if (title.length > 2) {
            this._title = title;
        }
    }
}
let harryPotter = new Book("Harry Potter, Book 1");
console.log(harryPotter.title); // ALLOWED to use getter method without ()
// shouldn't let me 
// harryPotter._title = ""; // NOT ALLOWED to direct access
harryPotter.title = ""; // ALLOWED to use setter method with assignment notation
// harryPotter._title = ""; // NOT ALLOWED direct access
console.log("title is still:", harryPotter.title);
