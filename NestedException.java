import java.util.Scanner;


public class NestedException {

// program that keep accesing an array until valid index is give by the user




    public static void main(String[] args) {

       
        // declearing an array
       int array []= new int[5];
        // taking inputs for the array elements
        for(int i=0;i<5;i++){
            System.out.print("Element["+i+"] :");
            Scanner sc=new Scanner(System.in);
            array[i]=sc.nextInt();
                 }

                Scanner sc=new Scanner(System.in);
              
                 boolean validIndexEntered = false;

                  while(!validIndexEntered){


                 try{
                     System.out.println("Enter the Index for array to access Element:");
                   int index=sc.nextInt();
                    System.out.println("The value of Element["+index+"] is :"+array[index]);
                    validIndexEntered=true;

                 }
                 catch( ArrayIndexOutOfBoundsException e){

                    System.out.println("Please Enter valid Index (0-4)");

                  }
                 
               
               }
              }


            }



        
    

    

