    // write a program that generates multiplication table and write it to the file
package Multiplication;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Multiplication{


// method that return multiplication of a given number.
    public static String multiplication(int n){
      int number=n;
        StringBuilder sb=new StringBuilder();
        sb.append("The Multiplication table of ").append(number).append(" is follows:\n");
        for(int i=0;i<=10;i++){
            sb.append(number).append(" * ").append(i).append(" = ").append((number*i)).append("\n");

             }

             return sb.toString();

    }


    public static void main(String[] args) {



        // creating a class for stringbuilder
        
       char input;
        System.out.println("Do You want to print Multiplication Table ???");
        System.out.println("Y->yes\t\tN->no");
        Scanner sc=new Scanner(System.in);
        input=sc.next().charAt(0);



        // creating a folder to move all the txt file
        File folder=new File("Multiplication_Table");
        try{
            if(!folder.exists()){
        folder.mkdir();
            }
        }
        catch(Exception e){
            System.out.println("Folder Cannot Be created.");
        }

        
if(input=='y'|| input=='Y'){
        // creating a file 
           for(int i=1;i<=9;i++){
        File file=new File("MultiplicationTable"+i+".txt");
        try{
        file.createNewFile();
        }
        catch(Exception e){
            System.out.println("Sorry Unable to Create file.");
        }


    
        // writing to that file
        try {
            FileWriter filewrite=new FileWriter("MultiplicationTable"+i+".txt");
          
            filewrite.write(multiplication(i));
            filewrite.close();


            // moving files to the folder
             Path sourcePath = file.toPath();
             Path destinationPath = new File(folder, file.getName()).toPath();
               Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

             }


        catch (Exception e) {
            System.out.println("Sorry:File cannot found.");
            e.printStackTrace();
        }
    }
}
    
else{
    System.out.println("Invalid Input:");
}
    

    
        
    }
}





   
    
    
