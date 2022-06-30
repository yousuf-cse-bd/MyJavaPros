package basicPro;

import java.util.Scanner;

public class ASCCI_Value {

    public static void main(String[] args) {

        String string;
        int i, sum = 0;
        System.out.print("Enter A Char Here: ");

        Scanner scanner = new Scanner(System.in);
        string = scanner.next();

        for(i = 0; i < string.length();i++){
            sum = sum + string.codePointAt(i);
            System.out.println(string.charAt(i)+": ASCII Value: "+string.codePointAt(i));
        }
        System.out.println("Total ASCII Value of the String: "+sum);
    }
}
