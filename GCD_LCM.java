package basicPro;

import java.util.Scanner;

public class GCD_LCM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1,num2, rem, x,y;

        System.out.print("Enter First Number Here : ");
        x = scanner.nextInt();

        System.out.print("Enter Last Number Here : ");
        y = scanner.nextInt();

        num1 = x;
        num2 = y;

        while(num2 !=0){

            rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        System.out.println("GCD : "+ num1);
        System.out.println("LCM : "+(x*y)/num1);
    }
}
 //