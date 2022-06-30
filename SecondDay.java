package basicPro;

import java.util.Scanner;

public class SecondDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mealCost ,tipPercent,taxPercent;

        mealCost = scanner.nextDouble();
        tipPercent = scanner.nextDouble();
        taxPercent = scanner.nextDouble();

        double tip,tax,totalCost;
        tip = mealCost * (tipPercent/100);
        tax = mealCost * (taxPercent/100);

        totalCost = mealCost + tip + tax;

        long l = (long)totalCost;
        tip = totalCost - (double)l;

        if(tip>=.50){
            System.out.println((long)totalCost+1);
        }
        else{
            System.out.println((long)totalCost);
        }



    }
}
