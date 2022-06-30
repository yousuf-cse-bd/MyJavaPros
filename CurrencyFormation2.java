package basicPro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormation2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment;
        payment = scanner.nextDouble();
        scanner.close();
        //Build Custom Currency Formation
        Locale indiaLocale = new Locale("en","IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chaina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: "+us.format(payment));
        System.out.println("India: "+india.format(payment));
        System.out.println("China: "+chaina.format(payment));
        System.out.println("France: "+france.format(payment));
    }
}
