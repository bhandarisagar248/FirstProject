public class RohmbusPattern {

    public static void main(String[] args) {

     int i,j;

     // define no of rows
     int n=5;


        // outer loop or for number of rows
      for(i=1;i<=n;i++){
            
        
        // loop to print the space
        int space=n-i;
        for(j=1;j<=space;j++){
            System.out.print(" ");

         }

         // loop to print the pattern
            for(j=1;j<=n;j++){

                System.out.print("*");

            }

            
            System.out.println();
     }
        
   
    
}
}