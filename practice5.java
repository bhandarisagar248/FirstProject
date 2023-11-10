package com.company;
import com.company.Rectangle;
import com.company.Square;
 import com.company.Cylinder;
 import com.company.Circle;



public class practice5  {

public static void main(String[] args) {
    


    // creating an object of the class rectangle

    Rectangle rectangle=new Rectangle();
    rectangle.getparameter(1,2,3);
    System.out.println("The Volume of the rectangle is "+rectangle.volume());
     System.out.println("The Area of the rectangle is "+rectangle.area());
      System.out.println("The Perimeter of the rectangle is "+rectangle.perimeter());


   // creating an object of the class Square
   System.out.println();
   System.out.println();

    Square square=new Square();
    square.getparameter(3);
    System.out.println("The Volume of the Square is "+square.volume());
     System.out.println("The Area of the Square is "+square.area());
      System.out.println("The Perimeter of the Square is "+square.perimeter());



        // creating an object of the class cylinder
   System.out.println();
   System.out.println();

    Cylinder cylinder=new Cylinder();
    cylinder.getparameter(1,5);
    System.out.println("The Volume of the Cylinder is "+cylinder.volume());
     System.out.println("The Area of the Cylinder is "+cylinder.Surfacearea());
      System.out.println("The Perimeter of the Cylinder is "+cylinder.perimeter());



        // creating an object of the class Circle
   System.out.println();
   System.out.println();

    Circle circle=new Circle();
    circle.getparameter(5);
    System.out.println("The Area of the Circle is "+circle.area());
      System.out.println("The Perimeter of the Circle is "+circle.perimeter());

      






}




    
}
