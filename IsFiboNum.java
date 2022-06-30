package basicPro;

import java.util.Scanner;

public class IsFiboNum {
    /****
     * Is number Fibonacci or not
     * @Autor: Muhammad Yousuf Ali
     * @Since: WedDay; 3 July 2019
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i, j, testCase;
        boolean b = false;
        long firstValue, secValue, sum, n;
        System.out.print("Enter TestCase Value Here: ");
        testCase = scanner.nextInt();
        j = 1;
        while (j < testCase) {
            System.out.println("J = "+j);
            firstValue = 0;
            secValue = 1;
            System.out.print("Enter a Value Here: ");
            n = scanner.nextInt();
            if (n == firstValue || n == secValue) {
                System.out.println("IsFibo");
            } else {
                for (i = 2; i <= n + 2; i++) {
                    sum = firstValue + secValue;
                    if (n == sum) {
                        b = true;
                    }
                    firstValue = secValue;
                    secValue = sum;
                }
                if (b == true) {
                    System.out.println("IsFibo");
                    b = false;
                } else {
                    System.out.println("IsNotFibo");
                }
                n = 0;
                sum = 0;
                j++;
            }
        }
    }
}

