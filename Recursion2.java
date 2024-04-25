public class Recursion2 {

// function to print from 1 to 5 using recursion

public static void recursion(int n){
  

    if (n==6){
        return;

    }

    System.out.println(n);
    // calling recursion function
    recursion(n+1);

}

    public static void main(String[] args) {
        


         // calling recursion 
         recursion(1);


    }
    
}
