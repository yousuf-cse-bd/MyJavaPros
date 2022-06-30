package basicPro;

import java.util.Scanner;

///Java Strings Introduction
public class StringsIntroduction {

    //Main Method
    public static void main(String[] args) {

        //Scanner Class Declare
        Scanner scanner = new Scanner(System.in);
        String firstString;
        String lastString;

        firstString = scanner.next();
        lastString = scanner.next();

        System.out.println(firstString.length() + lastString.length());
        System.out.println(firstString.compareTo(lastString)>0?"Yes":"No");
        System.out.print(firstString.substring(0,1).toUpperCase()+firstString.subSequence(1,firstString.length()));
        System.out.println(" "+lastString.substring(0,1).toUpperCase()+lastString.subSequence(1,lastString.length()));

    }
}
