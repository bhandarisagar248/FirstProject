
    // Questions 
    // 1, Create a class having  method  with depricated annotation.What is the effect of the deprication in the execution of the program 
    // there is no effect of the deprication on the program.If we call the deprication method and print the method there is no any error .The compiler Compile and Execute the program successfully 
     
    // 2 Supress the Message for q 1.






public class advancejava4 {
    

    interface mobile{
     public void call();
     void switchoff();
     void reboot();

}



    class phone{
          void ring(){
            System.out.println("Phone is ringing.");
        }
        void music(){
            System.out.println("Music is Playing.");
        }

        @Deprecated
        void displaysize(){
            System.out.println("The aspect ratio is 3:4");
        }
        
    }

        public static void main(String[] args) {
            // supressing deprication warning
            @SuppressWarnings("Depricated")
            advancejava4 obj=new advancejava4() ;
         mobile ob=new mobile(){
                @Override
                public void call(){
                    System.out.println("The phone is Engaged.");
                };


                 @Override
               public  void switchoff(){
                System.out.println("Turning off the phone");
               };


     @Override
           public void reboot(){
            System.out.println("Phone is rebooting");
           };

                
            };


            // calling methods 
            ob.call();
            ob.switchoff();
            ob.reboot();
          
        }

    }







