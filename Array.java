import java.util.Scanner;

public class Array {
    
// program to take an array input from the user and Search for the value X and Print the Index

    public static void main(String[] args){

       
        int n;
             System.out.println("Enter the size of the array:");
             Scanner sc =new Scanner(System.in);
             n=sc.nextInt();


             // loop to take array input from the array
             //declearing an array
             int number[]= new int[n];

             for(int i=0;i<n;i++){
                        
                System.out.print("Number"+"["+(i)+"]:");
                number[i]=sc.nextInt();
                    
            }


            int x;
            System.out.println("Enter the number to find the index:");
            x=sc.nextInt();

            // loop to check the array elemnts with the inputed number
            for(int i=0;i<n;i++){
                        
                if(number[i]==x){
                    System.out.println("The index of "+x+" is: "+i);
                }
                
                
                     }




    }
}
