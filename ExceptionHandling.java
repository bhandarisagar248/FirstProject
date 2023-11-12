import java.util.Scanner;

public class ExceptionHandling  {
public static void main(String[] args) {
    

//int a=6,b=2;
//try{
//int c=a/b;
//System.out.println("The Final result is:"+c);
//}
//catch(Exception e){
//System.out.println("Cannot divide by zero :");
//}


// declearing array of marks
int [] marks=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements:");
for(int i=0;i<5;i++){

 System.out.print("Marks["+i+"] :" );
  marks[i]=sc.nextInt();

}



// taking index and number as an input;
System.out.println("Enter the index for array (Numerator)");
int index=sc.nextInt();
System.out.println("Enter the Denominator:");
int Denominator=sc.nextInt();

//// to divide the array indexed number by user input number

// two exceptions arises here 
//1. Arrayoutoftheindex 
// 2. Arithmetic Exceptions
// Trying to solve individual index
 try{
System.out.println("The division is "+marks[index]/Denominator);
 }
 catch(ArithmeticException e){
    System.out.println("Cannot Divide by zero :");
    System.out.println("Enter Valid Divisor(Denominator)");
}
catch(ArrayIndexOutOfBoundsException e){

    System.out.println("Index is Out of the Bound:");
    System.out.println("Enter Correct Index Number.");
}








}    
}
