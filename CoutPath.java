import java.util.Scanner;

public class CoutPath {
// function  to find the path inside a matrix from (0,0) to (m,n)



// declearing a recursive function
public static int CountPath(int i,int j,int m,int n){


     if(i==m || j==n){

        return 0;
     }
   if(i==m-1 && j==n-1){

    return 1;

}

// move downwards
int downPath=CountPath(i+1, j, m, n);

// move right
int RightPath=CountPath(i, j+1, m, n);


return downPath+RightPath;


      

}

public static void main(String[] args) {
    
    // declearing varaible for number of rows and columns
    int m,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    m=sc.nextInt();
    System.out.println("Enter the number of columns:");
    n=sc.nextInt();

    // calling recursive function
        int result=CountPath(0, 0, m, n);
        System.out.println("The total path are:"+result);
}


    
}
