import java.util.Scanner;

public class RecursionPower {

// recursion function to calculate the power of  an number X^N
public static int power(int x,int n){
 if(n==0){
    return 1;
 }
 else if(x==1){
    return 0;
 }
 else{
   return x*power(x,n-1);
    
 }
}

 public static void main(String[] args){
    int x,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    x=sc.nextInt();
    System.out.println("Enter the Power;");
    n=sc.nextInt();
    // calling function to print the power of a number
    int result=power(x, n);
   System.out.println(" ("+x+") Power ("+n+")is: "+result);



 }
}
    

