import java.util.Scanner;

public class practice6 {

   public static class MaxTry extends Exception{

    @Override
    public String toString(){

     return  "Max Try have been reached";
      
    }

  }
  public static void array() throws MaxTry{

      int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        
    // declearing an array 
            
      int arr[] =new int[n];
      // taking an input for the array
      System.out.println("Enter the elements :");
      for(int i=0;i<n;i++){
        System.out.print("Elements["+(i)+"] :");
        arr[i]=sc.nextInt();


      }
    boolean bool=false;
        int i=0;
      while(!bool){
       
        try{
          
      int index;
      System.out.print("Enter the index to access the array :");
      index=sc.nextInt();
      System.out.println("The element at index "+index+" is:"+arr[index]);
        i ++;
        
      
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please :) Enter valid index :");
          
        }
        
        if(i==n){
          try{
          throw new MaxTry();
        }
        catch(Exception e){
          System.out.println(e.toString());


        }
        bool=true;
        
      }
      
      
      }


      



        






  }


public static void main(String[] args) {
  try {
    array();
  } catch (practice6.MaxTry e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
      
    }




    
}
