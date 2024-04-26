import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubsequence {

// program to find the unique subsequences of a string 


// creating a recursive function to find the subsequences
public static void subsequences_Unique(String name,int index,String newString,HashSet<String> set){


    

   if(index==name.length()){

    // to check whether the string is already present in the hasset or not
    if(set.contains(newString)){

        return;

    }
    else{
          System.out.println(newString);
          set.add(newString);
          return;
    }
}
    
    char currchar =name.charAt(index);
    // to include a character to newstring
    subsequences_Unique(name, index+1, newString+currchar, set);
     
   

   // not to include a character to a string
   subsequences_Unique(name, index+1, newString, set);


}

public static void main(String[] args) {
    
    HashSet<String> set=new HashSet<>();
    String name;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string to find a subsequences:");
    name=sc.nextLine();

    // calling recursive function
    System.out.println();
    System.out.println("The Required Unique Subsequences of a string "+name+" are:");
    System.out.println();
    subsequences_Unique(name, 0, "",set);

    System.out.println(set);
}

    
}
