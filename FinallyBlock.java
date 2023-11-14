public class FinallyBlock {

    public static int greet(){
        // try catch block for the exception Handling
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        
            // finally block contains the code which is executed at any condition ,whether the exception is handled or not 
    // finally block is executed 
    
        finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;



    }
    public static void loop() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    // Simulating an exception to trigger the finally block
                    throw new RuntimeException("Exception occurred!");
                }
            }
        } 
        
        catch(Exception e){
        System.out.println(e);    
        }

        finally {
            System.out.println("This is the finally block in loop(): Cleaning up resources...");
        }
    }
    

  public static void main(String[] args) {
        int k=greet();
        System.out.println(k);
         loop();

         int a = 7;
        int b = 5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
        

   
        }
 



    
    









    

