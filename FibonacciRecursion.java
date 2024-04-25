import java.util.Scanner;

public class FibonacciRecursion {

// recursion function for the fibonacci series
public static void fibonacci(int a,int b,int n){
  
if(n==0){

    return;
}


 

     int nextterm=a+b;
     System.out.print(nextterm+"\t");
     
     fibonacci(b,nextterm,n-1);

   
    





}
    public static void main(String[] args){


        int a=0,b=1;
  // printing the two valuws a,b
  System.out.print(a+"\t");
  System.out.print(b+"\t");
fibonacci(a,b,5);

    }
}