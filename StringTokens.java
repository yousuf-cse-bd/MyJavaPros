package basicPro;

import java.util.Scanner;

public class StringTokens {
    /****
     * Java String Tokens
     * @Author: Muhammad Yousuf Ali
     * @Since: Friday; 5 July 2019
     */

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a String Here: ");


        String string ;

        string = scanner.nextLine();

        String eliminate = "[ .,?!']+";

        String [] tockens = string.split(eliminate);
        System.out.println(tockens.length);
        for(int i = 0; i < tockens.length; i++){
            System.out.println(tockens[i]);
        }

    }
}
