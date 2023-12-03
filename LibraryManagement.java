import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement extends Thread {
   public static Scanner sc=new Scanner(System.in);

             // creating an array list to store different books 
            static ArrayList<String> books=new ArrayList<>();
            
     // function to add book to the list
         public void addbook(String name){
            books.add(name);
        }



        // function to show available books
        public static void availablebooks(){
          System.out.println("The Available Books are:");
          System.out.println();

        for(int i=0;i<books.size();i++){

            try{
            Thread.sleep(1000);
             System.out.println((i+1)+":"+books.get(i));
            }
            catch(Exception e){
                System.out.println("Runtime Error:");
            }
        }
    }


          // function to borrowbook from library
          public static void BorrowBook(){
               try{
              int n;
          availablebooks();
                  
          Thread.sleep(1000);

                System.out.println();
            System.out.print("Choose a book to Borrow:");
            n=sc.nextInt();
            
            Thread.sleep(1000);
            System.out.println("Success");
             System.out.println("Thanks!!!! For Borrowing:"+books.get(n-1));
            
            books.remove(n-1);
            }
            catch(Exception e){
                System.out.println("Error");
            }
     
           

        }
            // function to add book that have been returned
            public static void ReturnedBook(){
                              try{

                    String book;
                System.out.println("Enter Book Name:");
                Scanner sc =new Scanner(System.in);
               book=sc.nextLine();
                books.add(book);
                Thread.sleep(500);
                System.out.println("!!Successfully Added!!");
                System.out.println();

               availablebooks();
                              }
                              catch(Exception e){
                                System.out.println("Runtime Error");
                              }
            }


            // function to store reported issue

            public static void ReportIssue(){

                     String report;
                     System.out.println("Describe a issue you want to report.");
                     report=sc.nextLine();

                            }
              
           


               


          





    public static void main(String[] args) {
          /*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */

         boolean runloop=false;


           Scanner sc=new Scanner(System.in);

        
  LibraryManagement lb=new LibraryManagement();
  lb.addbook("Think and Grow Rich");
  lb.addbook("Rich Dad Poor Dad");
  lb.addbook("Atomic Habits");
  lb.addbook("The Art of Not Giving a Shit");
  lb.addbook("Psychology Of Money");
  lb.addbook("Power Of Subconscious Mind");
  lb.addbook("How To Influence People");
  lb.addbook("48 Law Of Power");





try{
  // giving multiple option to chooose
  Thread.sleep(1000);
  System.out.print("\t+++Welcome ");
 Thread.sleep(800);
  System.out.print("To ");
   Thread.sleep(800);

  System.out.print("LIBRARY ");
   Thread.sleep(800);

    System.out.print("MANAGEMENT ");
     Thread.sleep(800);

        System.out.println("SYSTEM+++");
        
}
catch(Exception e){
    System.out.println("Error");
}

while(!runloop){
  try{
  System.out.println();
  System.out.println("\t***Choose An Operation*** ");

    Thread.sleep(1000);

  System.out.print("1->Show Books");
  Thread.sleep(1000);
    System.out.println("\t\t\t 2->Borrow Book");
      Thread.sleep(1000);

      System.out.print("3->Return Book");
        Thread.sleep(1000);
     System.out.println("\t\t\t 4->Report");



}
catch(Exception e){
    System.out.println("Error");
}

int operation =sc.nextInt();


// using switch case 
switch (operation) {
    case 1:
        availablebooks();
        break;

    case 2:
        BorrowBook();
        break;
     
      case 3:
        ReturnedBook();
        break;
   
     case 4:
     ReportIssue();
         break;


    default:
    System.out.println("Invalid Input:(Choose between 1-4)");
        break;


        
}

// using while loop to rerun the program
char choose;
System.out.println();
System.out.print("Press 'Q' to Exit ");
    System.out.println("\t\t\t Press 'S' To go Main Menu ");
    choose=sc.next().charAt(0);

if(choose =='q' || choose=='Q'){
  runloop=true;


}

}
  System.out.println("::::Thank You For Choosing US::::");

    



}


 }

    






   
