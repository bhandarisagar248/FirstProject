import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class AdvanceJava2 {

    // use Date class in java to print the time in the format 12:23:45
    public static void main(String[] args) {
        // creating an object or instance of Date class
        Date date=new Date();
        System.out.println(date);
        System.out.println();



        
    // use Calendar class in java to print the time in the format 12:23:45
    Calendar patro=Calendar.getInstance();
    System.out.println(patro.getTime());
    
// use Time API in java to print the time in the format 12:23:45

LocalDateTime dt=LocalDateTime.now();
DateTimeFormatter dtf= DateTimeFormatter.ofPattern("HH:MM:SS");
String time=dt.format(dtf);

System.out.println(time);
    }
    
}
