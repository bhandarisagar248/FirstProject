import java.util.*;

public class arrayDeque {

    public static void main(String[] args) {


        // declearing arrayDeque 
        ArrayDeque<Integer> array= new ArrayDeque<>();
        // adding elements to the arraydeque
        array.add(5);
        array.add(10);
        array.add(15);
        array.addFirst(0);
        array.addLast(20);


        System.out.println(array);
        System.out.println(array.contains(120));

        
    }
}
