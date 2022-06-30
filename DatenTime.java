package basicPro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatenTime {

    public DatenTime(){
        Date date = new Date();

        System.out.println("\nCurrent Date: "+date);

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        System.out.println("Simple Format Date: "+dateFormat.format(date));
    }
    public static void main(String[] args) {

       DatenTime dt = new DatenTime();

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("Direct: "+time);
        System.out.println("Now at Time: "+time.format(formatter));

    }
}
