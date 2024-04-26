import java.util.Scanner;

public class SubsequencesRecursion {


    // TO find the Subsequence of a string using Recursion Funcion
    

    // Recursive function Declearation
    public static void Subsequence(String name,int index, String newString /*to store the character */ ){
                      if(index==name.length()){
                        System.out.println(newString);
                        return;
                      }
                            
                      char currentChar=name.charAt(index);
                                               
                      // calling recursive function
                      // to include the character

                      Subsequence(name, index+1, newString+currentChar);

                      //calling recursive function 
                      // not to include a character
                      Subsequence(name, index+1, newString);
                         

         
    }

    public static void main(String[] args) {
        String name;
        System.out.println("Enter a string to find the Subsequences:");
        Scanner sc= new Scanner(System.in);
        name=sc.nextLine();
        
        // calling function
        Subsequence(name, 0, "");
    }
    
}
