package basicPro;

import java.util.Scanner;

public class ReverseIntegerNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num,tmp,rem,sum;
        System.out.print("Enter a Value Here: ");
        num = scanner.nextInt();

        sum = 0;
        tmp = num;
        while (tmp != 0){
            rem = tmp % 10;
            sum = sum *10 + rem;
            tmp = tmp / 10;
        }
        System.out.println(num+" >> "+sum);
    }
}
