import java.util.ArrayList;
import java.util.Scanner;

public class Subset {
    // program to find the subset of the natural numbers n



    // function to print the subset
    public static void Print_Subsets(ArrayList<Integer> subset){


        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    

    // Recursive function decleration
    public static void Find_Subset(int n,ArrayList<Integer> subset){
// base case
   if(n==0){

    Print_Subsets(subset);
    return;
   }

        // to include a element 
        subset.add(n);
        Find_Subset(n-1, subset);
      
        // not to include a element
        subset.remove(subset.size()-1);
        Find_Subset(n-1, subset);

    }




    public static void main(String[] args) {
        //declearing an array to store the subsets
        ArrayList<Integer> subset=new ArrayList();

        Scanner sc=new Scanner(System.in);
        int n ;
        System.out.println("Enter a natural number to find the subsets:");
        n=sc.nextInt();


        System.out.println("The subsets of Natural number "+n+" are as follows: ");


        Find_Subset(n, subset);
    }
    
}
