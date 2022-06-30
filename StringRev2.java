package basicPro;

import java.util.Scanner;

public class StringRev2 {
    //Main Method
    public static void main(String[] args) {
        //Declare input class and its method
        Scanner scanner = new Scanner(System.in);
        ///Declare two string variables
        String original;
        String reverseStr;
        //Wanting input data by original var
        System.out.print("Enter a String Here: ");
        original = scanner.nextLine();
        //Declare and Conversion string to StringBuffer Class
        StringBuffer sb = new StringBuffer(original);
        reverseStr = sb.reverse().toString();
        ///Final Result OutPut
        System.out.println("Original String: "+original);
        System.out.println("\nReverse String: "+reverseStr);
    }
}
