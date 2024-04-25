import java.util.Scanner;

public class StringReverse {


    // recursion function to reverse string
    public static void Reverse(String name,int index){
    if(index==0){
        System.out.println(name.charAt(index));
        
    }

    else{

       System.out.print(name.charAt(index));
       Reverse(name, index-1);

    }


    }


    public static void main(String[] args) {
        //decleraing a string 
        String name;
       
        System.out.println("Enter a string to reverse:");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();

  
        // calling recursion function
          Reverse(name, name.length()-1);


    }
    
}
