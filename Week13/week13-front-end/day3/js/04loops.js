// LOOPS IN JAVASCRIPT
// similar to java

for (let x = 1, y = 10; x < y; x++, y--) {
    console.log(`x=${x}, y=${y}`);
}

let count = 0;
while (count++ < 10) {
    console.log(count);
}
// Note: of gets the values 
for (let x of [1, 2, 3, 4]) {
    console.log(x); // 1, 2, 3, 4
}

// Note: in gets the keys (here the keys are the index) 
for (let x in [1, 2, 3, 4]) {
    console.log(x); // 0, 1, 2, 3
}

let person = {name: "Jo", height: "5'8\""};
console.log(person);
for (let fact in person) {
    console.log(`fact about person is ${fact} is ${person[fact]}`);
}

let hello = "hello";
for (let letter of hello) {
    console.log(letter);
}