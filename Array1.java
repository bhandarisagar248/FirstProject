import java.util.Scanner;

public class Array1 {


    public static void main(String[] args) {
        
// declearing an array 
int age[]={21,22,24,25};



// loop to print the age
for(int i=0;i<age.length;i++){

    System.out.println(age[i]);
}


    

// program to take input for the array from the user
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of the array:");
n=sc.nextInt();
// declearing an array
int marks[] = new int[n];

 // taking an input using loop
 for(int i=0;i<n;i++){
    System.out.print("Marks"+"["+(i+1)+"]:");
    marks[i]=sc.nextInt();
 }



    }
    
}
