// This is a JavaScript file that I am using in the index2.html file
//   This code can't be run with node on the commandline because we are using the 
//     window and document objects that our browser engine creates
// 
// Let's try and grab an html element using some built in js apis

// Step 1: To grab an HTML element we need to use the DOM
/**
 * DOM = document object model
 * - the DOM is an interface that lets us interact with the elements on the page
 * - DOM is a hierarchy of objects that models the html elements on the page
 * - document is an object the browswer engine creates when running our code
 * 
 * 
 */
let div1 = document.getElementById("1");
let div2 = document.getElementsByClassName("dark-mode");
let h1 = document.querySelector("h1");
let btn = document.getElementById("myBtn");
// let div1 = document.querySelector("#1");
// let div2 = document.querySelector(".dark-mode");

// Add an event listener to run my code when the button is clicked
btn.addEventListener('click', () => {
    // And change the font size and color of div1.
    div1.style.fontSize = "2em";
    div1.style.color = "lightcoral";

    // Remove the dark-mode class from div2
    div2.classList.remove("dark-mode");
});

console.log(div1);
console.log(div2);
console.log(h1);

