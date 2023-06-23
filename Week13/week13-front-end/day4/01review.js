console.log("hello");
/**
 * Which of these are truthy vs falsy
 */
// In js we have truthy and falsy not just true and false
let x = 'a'; // truthy
x = ''; // falsy
x = [];
// x = x.length;
// x = {};
// let y;
// x = y;
// x = Number("0");
// x = Number("hello");
// x = Number("false");
// x = NaN;
// x = null;
// x = -0;
if (x) {
    console.log("truthy");
} else {
    console.log("falsy");
}
console.log("good bye");

/**
 * Falsy values in JS are
 * ----------------------
 * - '' empty string
 * 
 * Truthy values
 * -------------
 * - [] empty array
 * - 'a' string with values
 * - 
 */