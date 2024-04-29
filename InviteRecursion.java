import java.util.Scanner;

public class InviteRecursion {


    // to find the total no of ways to invite n guest in a party single or in pair using recursion
    public static int GuestCall(int n){
        // base case
        if(n<=1){
            return 1;
        }



        // for calling single
        int singlecall=GuestCall(n-1);

        // for calling double
        int doublecall=(n-1)*GuestCall(n-2);
        return singlecall+doublecall;
    }

    public static void main(String[] args) {
        // declearing a variable that store guestNumber
        int n;
        System.out.println("Enter the Number of Guests:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("The possible ways of  calls are: "+GuestCall(n));

    }
    
}
