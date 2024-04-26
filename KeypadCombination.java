import java.util.Scanner;

public class KeypadCombination {
    // program to print the keypad Combinations for the inputed number

    // statically decleraing a string array for keypad combination
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    // declearing a recursive function
    public static void Keypad_combination(String name,int index,String combination){

        // base case
        if(index==name.length()){
            System.out.println(combination);
            return;
        }

        char currchar=name.charAt(index);
        String mapping=keypad[currchar-'0'];// storing corresponding mapping of a currentChar to mapping string type
        for(int i=0;i<mapping.length();i++){

         // recurively calling function
        Keypad_combination(name, index+1, combination+mapping.charAt(i)); 

    }

}


public static void main(String[] args) {
    String name;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number: ");
    name=sc.nextLine();

    // calling recursive function to find the corresponding combination of strings for the number
    Keypad_combination(name, 0, "");

}
}
