import java.util.Scanner;

public class TOH {


    // recursion function decleration for Tower Of Honai
    public static void TOH (int n,char source,char auxillary,char destination){

        if(n==1){
            System.out.println("Move disk from "+source+" to "+destination);
        }

        else{

        TOH(n-1, source, destination,auxillary);
        TOH(1, source, auxillary, destination);
        TOH(n-1, auxillary, source, destination);

        }

    }





    public static void main(String[] args) {
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of disk:");
         n=sc.nextInt();

  // calling toh function
  TOH(n, 'A', 'B', 'C');
         



    }
    
}
