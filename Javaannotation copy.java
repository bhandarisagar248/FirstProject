public class Javaannotation {


    // Annotation is used to provide extra information about the program
    // it provides metadata to the class/method


class KeyPadPhone{
    @Deprecated
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}


        public static void main(String args[]){
            @SuppressWarnings("deprecation")



            // creating an object of class 
            Javaannotation obj=new Javaannotation();

            // creating an object of the base class(Andriod Phone)
            AndroidPhone Samsung = obj.new AndroidPhone();
            Samsung.sendMessage();
}
}



    

