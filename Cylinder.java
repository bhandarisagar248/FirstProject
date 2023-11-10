package com.company;

public class Cylinder {

    double radius,height;


// function to get length and breadth
void getparameter(double radius ,double height){
    this.radius=radius;
    this.height=height;
}

// function to find volume 
double volume(){
// 3.14*r^2*h
return Math.PI*Math.pow(radius,2)*height;
}


// function to find area
double Surfacearea(){
//2π r h + 2π r²
return (2*Math.PI*radius*height)+ (2*Math.PI*Math.pow(radius, 2)) ;
}



// function to find perimeter 
double perimeter(){


    //2(2r + h)

return 2*(2*radius+height);
}


    

    
}
