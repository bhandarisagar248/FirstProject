public class DiamondPattern {

    public static void main(String[] args) {
        

        int i,j;
        int n=4;


        // loop for number of rows or outerloop
        for(i=1;i<=n;i++){



            // loop for printing the space
            int space=n-i;
            for(j=1;j<=space; j++){
                System.out.print(" ");
                }

                // loop for half front pyramid

                for(j=1;j<=i;j++){
                    System.out.print("*");
                }

                // loop to print half back pyramid
                for(j=1;j<=i-1;j++){
                    System.out.print("*");
                }




                System.out.println();

        }
        for(i=n-1;i>=1;i--){



            // loop for printing the space
            int space=n-i;
            for(j=1;j<=space; j++){
                System.out.print(" ");
                }

                // loop for half front pyramid

                for(j=1;j<=i;j++){
                    System.out.print("*");
                }

                // loop to print half back pyramid
                for(j=1;j<=i-1;j++){
                    System.out.print("*");
                }




                System.out.println();

        }




    }
    
}
