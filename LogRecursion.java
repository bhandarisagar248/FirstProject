import java.util.Scanner;

public class LogRecursion {


    // creating an recursion function to calculate the power of x,that with stack height (log2^n=alpha)

    public static int  power(int x,int n){

        if(n==0){
            return 1;
        }
        else if(x==0){
            return 0;
        }
        else{

            if(n%2==0){
            return power(x, n/2)*power(x, n/2);

            }

            else{
                return power(x, n/2)*power(x, n/2)*x;
            }
        }
    }

    public static void main(String[] args) {
        
        int x,n;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        x=sc.nextInt();
        System.out.println("Enter the power:");
        n=sc.nextInt();


        // calling recursive function 
        int result =power(x, n);
        System.out.println(result);

    }
    
} 
