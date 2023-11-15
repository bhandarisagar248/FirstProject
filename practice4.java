import java.util.Scanner;




public class practice4 {
    // There are three types of error 
    /*   1.Syntax error
         2. logical error
     *   3.Runtime error
     * 
     */


     // function to perform division
     public static int divide(int a,int b){
        
        int division=a/b;
        return division; 
    }
        


     

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
/*  program to demonstrate syntax error
syntax error is detected automically by the compiler 
program shows syntax error and line of codes does not get compiled as there is syntax error;
*/
int a;
b=10;
System.out.println("The value of b is:"+b)
// the line is syntax error because there is no semicolone at the end of the program  and also datatype of b is not declered


   
/*  program to demonstrate logical error
logical error is not detected by the compiler
it is the error done by the programmer 
in logical error the program get compiled and also run but give different output 
 /* 
  * 

 */
int x=5;
int y=10;
int sum=y-x;
// here is the logical error as we are calculation sum between two numbers but the formula is of subtraction.

System.out.println("The Sum is:");
System.out.println(x+" + "+y +" = "+sum);


/*  program to demonstrate Runtime error
Runtime error is also known as Exception
like wise logical error  Runtime error is also  not detected by the compiler
In runtime error,the syntax as well as logic of the program is correct ,the program can compile and run properly 
but throws the Exception when we give certain inputs;

 */

 
int c,d;
System.out.println("Enter two values to perform divide :");
c=sc.nextInt();
d=sc.nextInt();
int divide=c/d;
// here we can see that when the value of d is 0;There occur an Exception 
System.out.println("The division is :"+divide);



// calling division function 

int dividend ,divisior;
System.out.println("Enter Dividend and Divisior:");
dividend=sc.nextInt();
divisior=sc.nextInt();
try{
System.out.println(divide(dividend, divisior));
}
catch(ArithmeticException e){
    System.out.println("HaHa");
}
catch(IllegalArgumentException e){
    System.out.println("HeHe");

}



catch(Exception e){

    System.out.println(e);

    }









    
}
}