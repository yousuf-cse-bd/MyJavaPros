package basicPro;
///Create By Muhammad Yousuf Ali
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currency;

        System.out.print("Enter Amount Here: ");
        currency = scanner.nextDouble();

        String string = Double.toString(currency);


         System.out.println("US: $"+string.subSequence(0,2)+","+string.subSequence(2,5)+"."+string.subSequence(6,string.length()-1));
         System.out.println("India: Rs."+string.subSequence(0,2)+","+string.subSequence(2,5)+"."+string.subSequence(6,string.length()-1));
         System.out.println("China: ￥"+string.subSequence(0,2)+","+string.subSequence(2,5)+"."+string.subSequence(6,string.length()-1));
         System.out.println("France: "+string.subSequence(0,2)+" "+string.subSequence(2,5)+"."+string.subSequence(6,string.length()-1)+" €");

    }
}
