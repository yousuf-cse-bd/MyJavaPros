package basicPro;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class StringDateDemo {

    public static void main(String[] args) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String  date = "29-06-2019 11:12:13";
        System.out.println(sdf.parse(date));
    }
}
