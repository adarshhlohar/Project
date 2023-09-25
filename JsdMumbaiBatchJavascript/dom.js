console.log("Hello how are you adarsh");

let parent = document.getElementById("heading");
let element = document.createElement("h1");
let text = document.createTextNode("This is a heading tag");
element.setAttribute("class","hello")
element.setAttribute("id","hello")
element.setAttribute("style","color:red")
// element.className("hello")
// element.addAttribute("class","hello")
element.appendChild(text)

parent.appendChild(element);

console.log(element)

// this is another example

ul = document.getElementById("myFirst");

let text2 = document.createTextNode("this is an unorder list");
let element2 = document.createElement("h1");
element2.appendChild(text2);
element2.setAttribute("style","background-color:grey")
console.log(element2);
let first = document.getElementById("first");
// ul.appendChild(element2)
ul.insertBefore(element2,first);

