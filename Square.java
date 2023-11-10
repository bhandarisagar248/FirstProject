package com.company;

public class Square  {

    double length;


    // function to get length and breadth
    void getparameter(double length ){
        this.length=length;
      
    }
    
    // function to find volume of square
    double volume(){
    
    return Math.pow(length, 3);
    }
    
    
    // function to find area of square
    double area(){
    
    return Math.pow(length, 2);
    }
    
    
    
    // function to find perimeter 
    double perimeter(){
    
    return 4*length;
    }
    
    
        



    
}
