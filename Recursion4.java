import java.util.Scanner;

public class Recursion4 {

    // program to find the number of  'x' (certain character) present in the string and form new string such that the all the 'x' are added to the last of a string
    
    
    // declearing a recursive functon
    
    public static int count=0;
    public static String newsString="";
    public static void Move_last(String name,int index,char element){
           if(index==name.length()){
            for(int i=0;i<count;i++){
                newsString=newsString+element;
            }

            System.out.println("The new String is:"+newsString);
            return;
           }

        if(name.charAt(index)=='x'){

            count=count+1;
        }
        else{

            newsString=newsString+name.charAt(index);

        }
        // calling recursive function to perform other comparision
        Move_last(name, index+1,element);

    }

    public static void main(String[] args) {
           String name;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the string:");
           name=sc.nextLine();

           // calling function
           Move_last(name, 0, 'x');


    }
    
}
