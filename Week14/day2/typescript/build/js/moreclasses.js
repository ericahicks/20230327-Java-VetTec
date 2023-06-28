"use strict";
class Parrot {
    constructor(color, speaks, _age, _favoriteFood = 'none') {
        this.color = color;
        this.speaks = speaks;
        this._age = _age;
        this._favoriteFood = _favoriteFood;
        this.color = color;
        this.speaks = speaks;
        this._age = _age; // CONVENTION is to name private fields starting with _ as a hint these should not be accessed directly
        this._favoriteFood = _favoriteFood;
    }
    getAge() {
        return `Hello, I'm ${this._age}`;
    }
    get favoriteFood() {
        return this._favoriteFood;
    }
    set favoriteFood(name) {
        if (typeof name === "string" && name.length > 1) {
            this._favoriteFood = name;
        }
    }
}
const polly = new Parrot('green', true, 40);
console.log(polly.getAge());
polly.favoriteFood = "seeds";
// console.log(polly._age) // INVALID cannot access private fields outside class
// console.log(polly.favoriteFood) // INVALID cannot acess protected fields outside class or subclass
class Kea extends Parrot {
    // DEFAULT access mofidier is PUBLIC
    constructor(elevation, // elevation in ft (Kea are a mountain parrot of New Zealand)
    // access modifier keywords  ommitted because these are just parameters
    //  and not new fields being declared since they are inherited
    // NOTE: cannot change inherited field's access modifiers more restrictive (but can change to readonly!)
    color, age, _favoriteFood = "none"
    // _favoriteFood: string = 'none' is inherited
    ) {
        super(color, false, age);
        this.elevation = elevation;
        this._favoriteFood = _favoriteFood;
        this.elevation = elevation;
    }
    get favoriteFood() {
        return this._favoriteFood;
    }
}
const taika = new Kea(1200, 'green', 4);
console.log("kea's favorite food is", taika.favoriteFood); // accessing getter method
class LaserPrinter {
    constructor(brand, model) {
        this.brand = brand;
        this.model = model;
        this.tonerLevel = 100;
        this.isPrinting = false;
    }
    print(document) {
        if (this.tonerLevel <= 5)
            throw new Error("Low toner. Replace toner to print.");
        console.log(document + " Printing...");
        this.tonerLevel -= 2; // reduces by 2% each time 
    }
    replaceToner() {
        this.tonerLevel = 100;
    }
}
const myPrinter = new LaserPrinter('hp', '12xx');
console.log("toner level is", myPrinter.tonerLevel);
;
myPrinter.print("myessay");
console.log("toner level is now ", myPrinter.tonerLevel);
;
//////////////////////////////////////
class Dog {
    static getPopulation() {
        return Dog.population;
    }
    constructor(name) {
        this.name = name;
        this.name = name;
        this.id = ++Dog.population;
    }
}
Dog.population = 0;
const spot = new Dog('Spot');
const chewy = new Dog('Chewy');
const sparky = new Dog('Sparky');
console.log("spot's id is", spot.id);
console.log("chewy's id is", chewy.id);
console.log("spary's id is", sparky.id);
console.log("dog population is now", Dog.population);
//////////////////////////////////
class FunParty {
    constructor() {
        this._guests = []; // initialize to empty array we can start adding to
    }
    get guests() {
        return this._guests;
    }
    set guests(value) {
        if (Array.isArray(value) && value.every(el => typeof el === 'string')) {
            this._guests = value;
        }
        else
            throw new Error('Guest list must be an array of strings');
    }
}
const myParty = new FunParty();
myParty.guests = ['Monica', 'Rachel', 'Chandler', 'Ross', 'Pheobe', 'Joey']; // I can use the guests(value) method like a property assignment
console.log(myParty.guests); // I can access the guests() method as if it was a property
myParty.guests = [...myParty.guests, 'Janice']; // I can use the spread operator to expand or "flatten" the array to usse its individual elements
console.log(myParty.guests);
myParty.guests = ['Emily', null]; // must be string data
