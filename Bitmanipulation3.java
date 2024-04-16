public class Bitmanipulation3 {


    public static void main(String[] args) {
        // program to clear the bit at the specific postion
    // Bit clear can be performed in 2 ways

        int n=12; // 1100
        
        int position=3;
         // tocalcualte the bit mask
         int bitmask= 1<<position;

          // (Way 1) 
          // performing NOT Operation to bit mask and 
          // Performing AND operation between Bitmask and the Original Number
           
          int notbitmask=~(bitmask);
          
          int result=notbitmask & n;
          System.out.println("The result is "+result);
         

          // (Way 2) the result is given by XOR 

         System.out.println("The result is : "+(bitmask^n));



    }


    
}
