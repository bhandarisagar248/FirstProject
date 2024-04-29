import java.util.Scanner;

public class TilePaving {

    // program to arrange 1*m tiles into a n*m floor



    // recursive function decleration
    public static int Tile_Count(int n,int m){

     // base condition
     //1 if rows and columns are equal the we can arrange tiles on floor in 2 ways either "Horizontal" or "Vertical"
      if(n==m){
        return 2;
      }

      // 2.if number of rows is less than bumber of colums the there is only one arrangement ("Horizontal")
      if(n<m){
        return 1;
      }


          // for horizontal 
        int horiontalpath=Tile_Count(n-1, m);
             
        // for vertical arrangement

           int verticalpath=Tile_Count(n-m, m);

           return horiontalpath+verticalpath;
    }

    
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of rows:");
        n=sc.nextInt();

        System.out.println("Enter a number of colums:");
        m=sc.nextInt();



        // stroing result and calling recursive function
        int result=Tile_Count(n, m);
        System.out.println("The total  arrangement are :"+result);

    }
}
