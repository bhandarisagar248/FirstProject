public class Lamda {


    // lamda expression is the expression that is used for the implemntation of Functional Interfac(Interface with only one method)
    @FunctionalInterface
    interface Calculator{
        void  sum();
        
          }


          public static void main(String[] args) {
            
            // creating an object of the interface with lamda expression
            Calculator ob=()->{

                System.out.println("This is the Lamda Expression.");


            };

            ob.sum();
          }

        





}
