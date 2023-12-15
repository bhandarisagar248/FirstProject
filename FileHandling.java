import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {


    // main class
    public static void main(String[] args) {
        // creating an object of the file class
        File file=new File("FileHandling_2.html");

        // 1 creating an new file in java 


        try{
        file.createNewFile();
        } 
        catch(IOException e){
            System.out.println("Unable to create a file:");
         }



         // 2 writing to a file 

         // creating an object of filewrite class
         try{
         FileWriter filewrite=new FileWriter("FileHandling_2.html");

               // calling function to write in the file
             filewrite.write("<html>  \r\n" + //
                     "<head>  \r\n" + //
                     "<title> Fibonacci Series in JavaScript </title>  \r\n" + //
                     "</head>  \r\n" + //
                     "<body>  \r\n" + //
                     "<script>  \r\n" + //
                     "// declaration of the variables  \r\n" + //
                     "var n1 = 0,  n2 = 1, next_num, i;  \r\n" + //
                     "var num = parseInt (prompt (\" Enter the limit for Fibonacci Series \"));  \r\n" + //
                     "document.write( \"Fibonacci Series: \");  \r\n" + //
                     "for ( i = 1; i <= num; i++)  \r\n" + //
                     "{  document.write (\" <br> \" +  n1); // print the n1  \r\n" + //
                     "    next_num = n1 + n2; // sum of n1 and n2 into the next_num  \r\n" + //
                     "      \r\n" + //
                     "    n1 = n2; // assign the n2 value into n2  \r\n" + //
                     "    n2 = next_num; // assign the next_num into n2  \r\n" + //
                     "}  \r\n" + //
                     "  \r\n" + //
                     "</script>  \r\n" + //
                     "</body>  \r\n" + //
                     "</html>  ");
             filewrite.close();
         }
         catch(IOException e){
            System.out.println("Unable to create object of filewriter class:");
         }


   
         // 3 Reading a file 


         File readfile=new File("FileHandling_2.html");
         // passing file object to the scanner class
         try{
         Scanner sc=new Scanner(readfile);
         while(sc.hasNextLine()){
              // storing the line in string
              String line=sc.nextLine();
              System.out.println(line);
            
         }

         // closing a file after reading it
         sc.close();
         }
         catch(Exception e){
            System.out.println("File does not exist");
         }

         
     


         // 4 deleting a file
         // creating a object of file class

         File file2=new File("filehandling2.txt");
         if(file2.delete()){

            System.out.println("File deleted Successfully.");
         }
         else{
            System.out.println("Some error Occured to Delete file");
         }
    }







    
}
