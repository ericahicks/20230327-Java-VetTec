// Definition:
// The Promise object represents the eventual completion 
// (or failure) of an asynchronous operation and its resulting value.

// Usage:
// A promise is a returned object to which you attach callbacks

// Solves the problem of nested callback pyramid of doom
doSomething(function (result) {
    doSomethingElse(result, function (newResult) {
      doThirdThing(newResult, function (finalResult) {
        console.log(`Got the final result: ${finalResult}`);
      }, failureCallback);
    }, failureCallback);
  }, failureCallback);

// Promise chaining is used instead
const promise = doSomething(); // doSomething returns a promise object
const finalResult = promise.then(successCallback, failureCallback); 

// Long promise chains are easier to read
doSomething()
  .then(function (result) {
    return doSomethingElse(result);
  })
  .then(function (newResult) {
    return doThirdThing(newResult);
  })
  .then(function (finalResult) {
    console.log(`Got the final result: ${finalResult}`);
  })
  .catch(failureCallback);