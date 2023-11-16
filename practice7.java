// Customs calculator 

import java.util.InputMismatchException;
import java.util.Scanner;

public class practice7 {
    // creating an custom Exception 
    public static int x;
    public static int y;

   public static class Invalidinput extends Exception{

        @Override
        public String toString(){
            return "Invalid Input:Please Enter Valid Input";
        }
    }
    
   public static class MaxInput extends Exception{

        @Override
        public String toString(){
            return "Input cannot be greater than 7000";
        }
        public String getmessage(){
            return "Input cannot be greater than 7000";
        }
    }
    

// Function to perform addition
public static void Addition(int a,int b) throws Invalidinput {
    System.out.println( a +" + "+b+" = "+(a+b));
    
} 
// Function to perform Subtraction
public static void Subtraction(int a,int b) throws Invalidinput {
    System.out.println( a +" - "+b+" = "+(a-b));
    
} // Function to perform Multipilcation
public static void Multiplication(int a,int b) throws MaxInput{
    System.out.println( a +" * "+b+" = "+(a*b));
    
} // Function to perform Division
public static void Division(int a,int b)throws ArithmeticException{
    System.out.println( a +" / "+b+" = "+(a/b));
    
} 

public static void main(String[] args) {
    
System.out.println("Enter Your choice:");
System.out.println("1:Addition");
System.out.println("2:Subtraction");
System.out.println("3:Multiplication");
System.out.println("4:Division");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 

try{
 System.out.println("Enter two values:");
    
     x=sc.nextInt();
     y=sc.nextInt();

    // if the input is greater than 7000 than throw MaxInput exception
    
    if(x>=7000 || y>=7000){
        try{
        throw new MaxInput();
        }
        catch(MaxInput e){
            System.out.println("*****Sorry***** ");
            System.out.println(e.toString());
            
        }


    }
}
catch(InputMismatchException e){
    System.out.println("Invalid INPUT !");
    System.out.println("Please:Enter Integer Value:");
}
    


switch (n) {
    case 1:
    try{
    Addition(x, y);
    }
    catch(Invalidinput e){
        System.out.println(e.toString());
        }
        
    break;

     case 2:
     try{
     Subtraction(x, y);
     }
     catch(Invalidinput e){
        System.out.println(e.toString());
     }
        break;


        case 3:
     try{
     Multiplication(x, y);
     }
     catch(MaxInput e){
        System.out.println(e.toString());
     }
        break;

            case 4:
     try{
     Division(x, y);
     }
     catch(ArithmeticException e){
        System.out.println("Cannot Divide By Zero:");
     }
        break;
        


    default:
    System.out.println("Invalid Input");
    System.out.println("Choose Between 0-4");
        break;
}

}

    
}
