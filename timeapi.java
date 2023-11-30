import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.text.DateFormatter;
public class timeapi {


    public static void main(String[] args) {



        // there are three types of useful classes in Java.Time api
        /* 1.LocalDate -> which give local date
        2.LocalTime-> which local time 
        3.Local datetime ->which gives calendar in time and date format
        4.DateTimeformatter ->which is use to change the date and time format (Eg: 2023-11-30  into 30.11.2023)

        
        */ 
        // creating an instant or object of the local date
        LocalDate d=LocalDate.now();

        // printing the local date 
        System.out.println("The current Date is:"+d);
         
         
        


        // creating an instinct/object of the LocalTime which give currenttime
        LocalTime t=LocalTime.now();
        System.out.println("The current time is:"+t);
         
          
        
        


          // creating an object for localDate And Time
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("Current Date and Time:"+dt);
       
        

// changing the date and time format 
  // declearing datetimeformatter class's object and assigning pattern for date
   DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
   String date=dt.format(dtf);
   System.out.println("Date in Format(dd-MM-yyy):"+date);
    System.out.println();
     




// changing date and time format using predefine formatter
   DateTimeFormatter dtf2=DateTimeFormatter.ISO_LOCAL_DATE;
   String dates=dt.format(dtf2);
   System.out.println("Date in Local Format:"+dates);



    }
    
}
