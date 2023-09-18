// varaible & operator of js
function display(){
document.write("i am external js ");
document.write("<br>");
//let variables -- local variable or block scope
let num1=30;
let num2 = 70
let res = num1 + num2;  //arithmetic
document.write(res + "<br>");
num1+= 10; //num1 + 10 = 30 +10 =40  //assigment
document.write(num1 + "<br>"); 

let res1 = num1 > num2;  //comparison
document.write(res1 + "<br>");

	document.write(a + "<br>"); //printing global variable
	document.write(teacher + "<br>"); //printing const variable
	
	let ab ="hello";
	let cd ="world";
	let res2 = ab > cd;
	document.write(res2 + "<br>");
	
	res3 = (num1>num2) || (num1<num2); //logical
	document.write(res3 + "<br>");
}

//parameterised function with return keyword
function calc(n1, n2){
	return n1 * n2;
}




