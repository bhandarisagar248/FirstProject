package com.company;

public class Circle {
 
 
 double radius;


 // function to get length and breadth
 void getparameter(double radius ){
     this.radius=radius;
     
 }
 

 
 // function to find area
 double area(){
 //πr^2
 return Math.PI*Math.pow(radius, 2) ;
 }
 
 
 
 // function to find perimeter 
 double perimeter(){
 
 
     //2πr
 
 return (2*Math.PI*radius);
 }
 
    
}
