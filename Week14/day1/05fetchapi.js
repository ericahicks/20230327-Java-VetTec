// On Friday we used XMLHttpRequests to get data from a REST API
/**
 * 1. Create a XMLHttpRequest object
 * 2. Set the HTTP method and url
 *    - For POST or PUT set the header to indicate the content type
 * 3. Set up a callback function for the onreadystate change event to call
 *    - Check for when the readystate is 4 DONE to get the contents of the HTTP response
 * 4. Send the HTTP request
 *    - For POST or PUT hand in the content to send to the backend api
 *    (Note: our Spring Boot REST Api expects JSON
 *           we also needed to add @CrossOrigin to our Spring Boot Controller class to allow requests)
 */

// Today we will use the more modern fetch API provided by our browser
// Example 1: fetch get request
// fetch('https://catfact.ninja/fact')
fetch('https://httpstat.us/404')
                                    .then(res => res.json())
                                    .then(data => console.log(data))
                                    .catch(error => console.log("ERROR fetching fact"));

// Example 2: fetch post request
// fetch('http://localhost:8081/books', {
//     method: "POST",
//     headers: {
//         'Content-Type': 'application/json'
//     },
//     body: JSON.stringify({
//             isbn: "1234567890",
//             authorFirstName: "Jane",
//             authorLastName: "Doe",
//             title: "Lost",
//             genre: "Mystery",
//             year: 2023
//     })
// }).then(res => res.json()).then(data => console.log(data));