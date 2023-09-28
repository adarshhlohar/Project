console.log("hello how are you");
'use strict'

// this gets value from owner
// arrow -> gets value from surrounding



// console.log(this);

// function test() {
//     console.log(this);
// }

let obj ={
    age : 10,
    test : function () {
        console.log(this);
    },
}

obj.test();

const test = ()=>{
    console.log(this);
}

test();