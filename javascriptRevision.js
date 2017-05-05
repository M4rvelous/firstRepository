//creating javascrip objects
//accessing individual object values



var book1 ; 
var book2 ;

book1 = {
  title :"The Hobbit",
  author:"JRR Tolkien",
  published: 1937
};

book2 = {
  title:"Too Big to Fail",
  author:"RS Srokin",
  published:2009
};

console.log(book1.title);
console.log(book2.published);
 
// changing values of objects

book1.title = "The Lord of the Rings";
book2.published = 2012; 

console.log(book1);
console.log(book2);

//another function


var x = 10 ;
var y = 50 ;
var a; 
function addition(){
  return x+y;
  
}

console.log(addition());

//a function that prints itself

function sayHello(){
  console.log("Hello Idiot");
}

sayHello();

// objects and functions working together 

var book1 ; 
var book2 ;

book1 = {
  title :"The Hobbit",
  author:"JRR Tolkien",
  published: 1937
};

book2 = {
  title:"Too Big to Fail",
  author:"RS Srokin",
  published:2009
};

function presentBook(){
  console.log("Book:"+ book.title);
  console.log("Author:"+ book.author);
  console.log("Publishing Date:"+book.published)
};

book = book1; 
presentBook();

book = book2; 
presentBook();

// moar objects and same function

var book1 ; 
var book2 ;
var book3 ; 
var book4 ;
var book5 ; 


book1 = {
  title :"The Hobbit",
  author:"JRR Tolkien",
  published: 1937
};

book2 = {
  title:"Too Big to Fail",
  author:"RS Srokin",
  published:2009
};

book3 = {
  title:"Flash Boyz",
  author:"Michael Lewis",
  published: 2014
};

book4 = {
  title:"Beating the Street",
  author:"Peter Lynch",
  published:1993
};

book5 = {
  title:"The essays of Warren Buffet",
  author: "Warren Buffet",
  published: 1997
};

function presentBook(){
  console.log("Our book for today is"+ book.title);
  console.log("by "+ book.author +".");
  console.log("Publishing Date:"+book.published)
};

book = book1; 
presentBook();

book = book2; 
presentBook();

book = book3; 
presentBook();

book = book4; 
presentBook();

book = book5; 
presentBook();
        
// function with argument

function showMessage(msg){
  console.log("This is the message:"+msg);
};

showMessage("Test Messsage");
showMessage("Hello World");
showMessage("This is another test");

// function with multiple arguments

function addition(x , y) {
  var sum = x + y ;
  console.log(sum);
};

addition(10 , 25);
addition(25,-58);
addition(12502365, 56952365);

// objects and functions with (one) parameter 

var item1;
var item2;
var item3;

item1 = {
  taxRate:0.1
};

item2 = {
  taxRate:0.25
};

item3 = {
  taxRate:0.5
};

function finalPrice(prc) {
  var price = prc+ (prc * item.taxRate);
  console.log("The final price is $"+price);
};

item = item1;
finalPrice(52);

item = item2;
finalPrice(85);

item = item3; 
finalPrice(120);

// return command and passing values around

function addition(x, y) {
  var sum = x + y ;
  return sum;
};

function subtraction(x,y) {
  var sum2 = x - y ;
  return sum2;
};

function mix(){
  console.log("The comgbined result is " + addition(8,25));
  console.log("The comgbined result is " + subtraction(78,24)); 
};

mix();








