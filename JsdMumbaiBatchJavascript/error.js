console.log("this is error handling topic");

// try {
//     let num = 101;
//     num.toLowerCase();
//     console.log(num);
// } catch (error) {
//     console.log(error.message);
// }

// try {
//     let name1 = prompt("Enter Youre name ")
// } catch (err) {
//     console.log(err.message);
// }
// finally{
//     console.log("hello");
// }


// user define or custom name
function check(num) {
    if (!(num>=-50 && num<=50)) {
        throw new RangeError("Number should be between -50 to 50");
    }
}

try {
    check(80)
} catch (err) {
    console.log(err);
}

try {
    let name2 = "Mamta";
    console.log(name2.concat(y));
} catch (error) {
    console.log(error.name + " " + error.message);
}