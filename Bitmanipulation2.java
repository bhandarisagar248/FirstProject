public class Bitmanipulation2 {
    
    public static void main(String[] args) {
        // program to perform bit manipulation
        // program to SET Bit

         int n=8; // 1000
         int postion=2;
          

         // to calculate the Bit mask
         int bitmask= 1<<postion;

         // Performing OR with original postion to get the result
         
        System.out.println( bitmask | n);
   


    }
}
