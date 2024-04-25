import java.util.Scanner;

public class Recursion3 {

// declearing a recursion function

public static int factorial(int n){

    if(n==0 || n==1){

        return 1;
    }

    else{

        return n*factorial(n-1);
    }
}


    // main class
    public static void main(String[] args) {
        
             Scanner sc=new Scanner(System.in);


             

        // taking input from the user 
        int n;
        System.out.println("Enter a number :");
        n=sc.nextInt();

              // calling function to store in factorial
        int factorial=factorial(n);

        System.out.println("The factorial of "+n+" is : "+ factorial);




    }
    
}
