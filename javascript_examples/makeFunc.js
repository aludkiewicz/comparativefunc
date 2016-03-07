/**
 * Closure example
 */

//JS_example_2
function makeFunc() {
  var alertText = "Hello world!";
  function displayName() {
    alert(alertText);
  }
  return displayName;
}

var myFunc = makeFunc();
myFunc(); // What happens here? Is alertText inside the scope or not?