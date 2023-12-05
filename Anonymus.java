 // program to implement anonymusclass

   // Anonymus Class is those class that is used to implement interface without creating of a concrete class
public class Anonymus {

// Creating an interface
interface Calculator{
void  sum();
 void sub();
  }










   

 public static void main(String[] args) {
    

    // creating an refrence or object of the interface
    Calculator obj=new Calculator() {
        @Override
        public
        void sum(){
            System.out.println("This is the method for calculation sum.");
        }


        @Override
        public
         void sub(){
            System.out.println("This is the method for calculation sub.");
        }

        
            };


            obj.sum();
            obj.sub();
 }





    
}
