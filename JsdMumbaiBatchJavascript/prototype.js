console.log("This is prototype!!");

let a = {
    name : "Adarsh",
    role : "Programmer",
    run : ()=>{
        console.log("self running");
    }
}



let p = {
    run : ()=>{
        console.log("Running");
    }
}

p.__proto__ = {
    name1 : "Jackey"
}

a.__proto__ = p;

console.log(a)
console.log(p)
console.log(a.run());
console.log(p.name1);
console.log(p.run());
console.log("a is seraching  name1 and found in p prototype " + a.name1);