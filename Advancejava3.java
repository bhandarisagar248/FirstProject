import java.util.HashSet;
import java.util.Set;

public class Advancejava3 {

// Create a set and Try to store duplicate element and verify that the only one instance is stored in set 
    public static void main(String[] args) {
        

        // Decleraing a set of hashset
        Set<Integer> set =new HashSet<>();
        

        // adding element to the set
        set.add(25);
        set.add(50);
        set.add(100);
        set.add(200);
        set.add(100);    // Duplicate 


        // printing elements of the set to check whether the both dublicated value are stored or not
        System.out.println(set);

    }
    
}
