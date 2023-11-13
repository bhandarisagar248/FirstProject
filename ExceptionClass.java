import java.util.*;

public class ExceptionClass {

    // creating an exception class by extending Build in Exception class
    static class MyException extends Exception {

        // creating two custom methods
        @Override
        public String toString() {
            return "I am toString method";
        }

        @Override
        public String getMessage() {
            return "This is getMessage method";
        }
    }

    public static void main(String[] args) {

        int a;
        System.out.println("Enter the value of a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a < 10) {
            // throwing a Custom MyException class
            try {7
                throw new MyException();
            } catch (MyException e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                 System.out.println(e);
                
            }
        } else {
            // Handle the case where a is greater than or equal to 10
        }
    }
}
