import java.util.ArrayList;

public class JavaGenerics {
    



    // declearing main class
    public static void main(String[] args) {
        

        // creating an arraylist
        ArrayList a=new ArrayList<>();


        // adding elements to the array
        a.add("String1");
        a.add(15);
        a.add(16);
        a.add(50);


        // calling the elements at the index  2

        // 
        int c=(int) a.get(2);
        System.out.println(c);


    }
}
