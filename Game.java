import java.util.Random;
import java.util.Scanner;


public class Game {
    public int computergenerate;
    public int userinput;

    Scanner sc= new Scanner(System.in); 


//1 constructer to generate random number

    public Game(){
        // creating random class for generation random number
        Random random=new Random();
        computergenerate=random.nextInt(9);
     }



    // 2 function to take userinput;
 public void userinput(){
       System.out.print("Enter your Guess number:");
        userinput=sc.nextInt();
    }


   // 3 function to check whether the computer generate number is equal to the userinput
   public int iscorrect(){
    if(computergenerate==userinput){
        System.out.println("Congratulation :)");
        System.out.println("Your guess is Correct:");
          System.out.println("*****");
       

        System.out.println("ComputerGenerate="+computergenerate);
        System.out.println("userinput="+userinput);

          return 1;
    }
    else{
           System.out.println(":( Sorry :( ");
        System.out.println("InCorrect:Try Again");
        return 0;
   }
}





   public static void main(String[] args) {

    System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
    System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
    System.out.println(":::::WELCOME TO THE NUMBER GUESSING GAME::::");
    System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
    System.out.println("::::::::::::::::::::::::::::::::::::::::::::");




    // creating object for the class game
    Game obj=new Game();

// calling userinput function for taking input from the user
do{
obj.userinput();

}
while(obj.iscorrect()!=1);

   

}
    

}