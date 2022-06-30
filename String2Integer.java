package basicPro;

import java.util.Scanner;

//String to Integer
public class String2Integer {

    public static void main(String[] args) {

        String s ;
        int number;
        Scanner scanner = new Scanner(System.in);
        try {
            s = scanner.next();
            number = Integer.parseInt(s);
            System.out.println(number);

        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }

}
