import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Advancejava5 {

    // creating a method that generates multiplication table of given number
    public static String multiplication(int n) {
        StringBuilder table = new StringBuilder();
        int number = n;
        table.append("The multiplication table of ").append(number).append(" is follows:\n");
        for (int i = 0; i <= 10; i++) {
            table.append(number).append(" * ").append(i).append(" = ").append(number * i).append("\n");
        }
        return table.toString();
    }

    // main class
    public static void main(String[] args) {

        // generation of table
        int n;
        System.out.println("Enter the number to generate multiplication table:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String tableResult = multiplication(n);

        // creating a file and adding the multiplication table generated to that file
        File file = new File("Multiplication.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Sorry : Unable to create a file.");
        }

        // writing to that file
        try (FileWriter fileWriter = new FileWriter("Multiplication.txt")) {
            fileWriter.write(tableResult);
            System.out.println("Multiplication table has been written to Multiplication.txt");
        } catch (IOException e) {
            System.out.println("Sorry: File cannot be found");
        }
    }
}
