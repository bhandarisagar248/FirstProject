

import java .util.*;
public class Stopwatch extends Thread {
Scanner sc=new Scanner(System.in);
 // creating object for the Thread
            int i;
            int n;
            public void settime(){
                System.out.println("Enter Time:");
                n=sc.nextInt();
                 this.i=n;
            }

         @Override
         public void run(){
         
            while (i!=0){
                System.out.println(i);
                try{
                Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println("Error:");
                }
                i--;
                
            }
            System.out.println("Finish!!!");
            

         }
              public static void main(String[] args) {
                // creating an object of the thread

                // calling settime method
                
                Stopwatch stopwatch=new Stopwatch();
                stopwatch.settime();
                stopwatch.start();
            
                




         }


    
    
}
