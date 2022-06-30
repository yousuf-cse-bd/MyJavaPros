package basicPro;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String original;
        String reverseStr = "";

        System.out.print("Enter a String Here: ");
        original = scanner.nextLine();

        int i;
        for(i = original.length() - 1 ; i>=0; i--){
            reverseStr = reverseStr + original.charAt(i);
        }

        if(reverseStr.equals(original)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
