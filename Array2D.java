import java.util.Scanner;

public class Array2D {



    public static void main(String[] args) {
        

        // for rows and colum of the matrix
        int n,m;
int i,j;
       

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        n=sc.nextInt();
        m=sc.nextInt();

         // declearing an 2D array
        // Declearing a 3 matrices a,b,c
        int a[][] =new int[n][m];
        int b[][] =new int[n][m];
        int c[][] =new int[n][m];



        // taking input for the matrix a;
        System.out.println("Enter the elements for the matrix a:");
        for(i=0;i<n;i++){ // loop for rows

            for(j=0;j<m;j++){ // loop for colums
                    a[i][j]=sc.nextInt();
                 }
                 System.out.println();
                 }


                 // code to find the index of the inputed number from the user ;
                 System.out.println("Enter the number to find the index:");
                 int x=sc.nextInt();

                 // using nested loop to find the element in the matrix
                 for(i=0;i<n;i++){

                    for(j=0;j<m;j++){
                        if(a[i][j]==x){
                            System.out.println("The element "+x+ " is at index: ["+i+"]["+j+"]");
                        }
                       
                    }
                    
                 }

        // taking input for the matrix b;
        System.out.println("Enter the elements for the matrix b:");
        for(i=0;i<n;i++){ // loop for rows
            for(j=0;j<m;j++){ // loop for colums

                 b[i][j]=sc.nextInt();


            }
            System.out.println();

        }


        // finding the sum of the two matrices
        for(i=0;i<n;i++){ // loop for rows
            for(j=0;j<m;j++){ // loop for colums

                 c[i][j]=a[i][j]+b[i][j];


            }
            System.out.println();

        }


        // to print the sum of the matrices
           System.out.println("The Sum of the two matrices (a and b) is :");
        for(i=0;i<n;i++){ // loop for rows
            for(j=0;j<m;j++){ // loop for colums
                     
                System.out.print("\t"+c[i][j]); 
                 
            }
            System.out.println();
        }

        }
    }
    

