public class Recursion {

    // Recursion is process that a function call itself;

// using recursion to print the Sum of the natural number;
 public static int sum(int n){
     
      if(n==0){

           return 0;
    
    }

    else{

        return n+ sum(n-1);
    }


}


public static void main(String[] args) {
    


    // calling function
    int Naturalsum=sum(5);
    System.out.println("The Sum of natural number is : "+Naturalsum);


}




}



   

  
