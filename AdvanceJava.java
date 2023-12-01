import java.util.ArrayList;
import java.util.Scanner;

public class AdvanceJava {
    // Practice set 1
    // create an ArrayList and store name of 10 students and print the name using for each loop

    public static void main(String[] args) {
        

        // creating an array list with object student
        ArrayList<String> student=new ArrayList<>();


        // Taing inputs of 10 student from the user
        for( int i=0;i<10;i++){
          String name;
          Scanner sc=new Scanner(System.in);
          System.out.print("["+(i+1)+"]"+" Student Name:");
          name=sc.nextLine();
          
          // adding name to the list
          student.add(name);
          
        
        }



        // printing the arraylist using for each loop
        for(String students:student ){

            System.out.println(students);
        }
    }
}
