package com.company;

public class Rectangle {
double length,breadth,height;


// function to get length and breadth
void getparameter(double length ,double breadth,double height){
    this.length=length;
    this.breadth=breadth;
    this.height=height;
}

// function to find volume 
double volume(){

return length*breadth*height;
}


// function to find area
double area(){

return length*breadth;
}



// function to find perimeter 
double perimeter(){

return 2*(length+breadth);
}


    





    
}
