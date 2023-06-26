// Ways to define a function

// 1 using named function keyword
function hello(name) {
    console.log("hello " + name);
}
hello("Erica");
// 2 using function keyword
const greet = function(name) {
    console.log("Greetings " + name);
}
greet("Joey");

// 3 using lambda
const sum = (x, y) => {
    return x + y;
}
console.log(sum(1, 2));

// 4 using methods
// functions declared inside an object are called "methods"
let person = {
    name: "Frodo", 
    age: 101,
    greeting(name) {
        console.log("Hi there " + name);
    }
    // greeting: function(name) {
    //     console.log("Hi there " + name);
    // }
}
person.greeting("Sam");

// TODO write an object literal with methods
// call the methods of your object

// Example
let person1 = {
    name: "Drizzt",
    age: 400,
    dodge(attack) {
        console.log("Drizzt dodged the " + attack)
    }
}
person1.dodge("sword");

let person2 = {
    name: "Jim",
    age: 38,
    parry(attack) {
        console.log("Jim parried the " + attack)
    }
}
person2.parry("Axe");



// Example
let game = {
    name: "Tera",
    price: 35,
    // cost(game, price) {
    //     console.log("This " + game +" costs $"+price);
    // }
    cost() {
        console.log("This " + this.name +" costs $"+ this.price); // this. is not automatically applied
    }
}
// game.cost(game.name, game.price);
game.cost();
