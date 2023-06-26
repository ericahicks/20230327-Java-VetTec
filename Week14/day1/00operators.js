// /////////////////////////////////////////////
// Operators we haven't seen before 

////////////////////////////////////////////////
// **
console.log(2**3); // 2^3 = 8
console.log(3**2); // 3^2 = 9

// == vs === is 
//  == 
// ===
console.log("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee")
console.log(1 == '1'); // true - because uses type conversio
console.log(1 === '1'); // false - strict type
console.log(1 == '1' && typeof 1 == typeof '1');

////////////////////////////////////////////////
// ?? null coelescence operator
// similar to ternary operator
let x = null;
console.log(x == null ? "hello" : x); // fall back if x is null is to just use "hello"
console.log(x ?? "hello");
let y;
console.log(y ?? "cat"); // no value in y so we get the fallback

let s = ""; // falsy
console.log(x ?? "dog"); 

let o = {}; // truthy
console.log(o ?? {name: "Frodo", age: 101});

let a = []; // truthy
console.log([] ?? [1, 2, 3]); 

// TODO use the other falsy values with the null coalescent operator
// (and some truthy values examples)
// https://developer.mozilla.org/en-US/docs/Glossary/Falsy 
let ex1 = undefined;
console.log(ex1 == undefined ? "hello" : ex1);
console.log(ex1 ?? "hello");
let ex2= NaN;
console.log(ex2 ?? 10);
let ex3 = 0;
console.log(ex3 ?? 1);
let ex4 = 0n; // remember n indidates this is a BigInt not a number type
console.log(ex4 ?? 10n);

// Note: undefined is considered nullish
console.log(undefined == null);

///////////////////////////////////////////////
// ?. optional chaining operator
let str = null;
// console.log(str.length); // in java we would get a null pointer exception
// To avoid TypeError: Cannot read properties of null (reading 'length')
console.log(str?.length); // prevents error so my code can continue, we just get undefined

//////////////////////////////////////////////////////////
let myObj = {name: "Frodo", age: "101", homeAddress: null};
// let's loop through the object and print out it's property values
// of iterates over the values
// in iterates over the keys
for (let key in myObj) { // name, age, homeAddress
    let str = myObj[key]; // Frodo, 101, 123 Main St.
    console.log(str?.length); // print length of the string -- this would be something more useful
}
console.log("Done!")

str = undefined;
console.log(str?.length);

///////////////////////////////////////////////
// || returns left operand when left operand is truthy (else returns right operand)
// uses short circuiting
// useful for providing fall-backs
let someVar = false;
console.log(someVar || "cat");
someVar = "cockatoo"
console.log(someVar || "cat"); // short circuites give me the first value
console.log(undefined || "cat"); // falsy so "cat"
console.log(null || "cat"); // "cat"
console.log("" || "cat"); // "cat"
console.log({name: "Boots", species: "cat"} || "cat"); 
console.log({} || "cat"); // empty object is not falsy
// falsy: null, undefined, false, ""
