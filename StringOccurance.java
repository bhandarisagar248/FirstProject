import java.util.*;

public class StringOccurance {
// recursion function to find the first and last occurance of an element;

// Declearing first and last static variable to store the index
public static int first =-1;
public static int last=-1;


// recursive function
    public static void Occurance(String name,int index,char element){
          


 if(index==name.length()){

    return;
 }
     
 char currentelement=name.charAt(index);
 if(currentelement==element){

    if(first==-1){// if the first value is not updated 
      // update the  current index as the first index 
      first=index;
                   
    }

    else{
     // if the first is already updated 
     // then make the current index as the last index
     last=index;

    }

    


 }
     // calling recursively to check for the updated index

 Occurance(name, index+1, element);

       
    }




    public static void main(String[] args) {
        String name;
      
        System.out.println("Enter the String:");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Enter the element:");
        

        

        // calling function to print the first and the last element of the string
        Occurance(name, 0, 'a');

        System.out.println("The first index of Element a is :"+first);
    System.out.println("The last index of Element  a is :"+last);
        
    }
    
}
