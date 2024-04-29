import java.util.Scanner;

public class Permutationecursion {

    // program to find the permutation using recursive method

    // recursive function decleration
    public static void Permutation(String name,String permutation){

      if (name.length()==0) {
        System.out.println(permutation);
        return ;
        
      }
              
    
      for(int i=0;i<name.length();i++){
           char currChar=name.charAt(i);
           String newString=name.substring(0, i)+name.substring(i+1);
           
           // calling recursive function
           Permutation(newString, permutation+currChar);
        



      }




    }


    public static void main(String[] args) {
        String name;
        System.out.println("Enter a string to find a permutation:");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();


        // calling recursive function 
        System.out.println("The permutation is:");
        Permutation(name, "");


    }
    
}
