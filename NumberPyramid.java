public class NumberPyramid {
    


    public static void main(String[] args) {
         int i,j;
         // number of rows
         int n=5;


     // loop for the outer loop or for the rows

     for(i=1;i<=n;i++){

      // declearing space to print the space 
  int space =n-i;


  for(j=1;j<=space;j++){
             
    System.out.print(" ");

}

// inner loop or for the columns to print the number pyramid
        for(j=1;j<=i;j++){
             
            System.out.print(i+" ");
        
             }




        System.out.println();



        }



     }






    }

