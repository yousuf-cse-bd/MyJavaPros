package yousuf;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num,rem,sum, n;
        sum = 0;

        System.out.println("Enter a value here: ");
        num = scanner.nextInt();

        n = num;
        while (n !=0){
            rem = n % 10;
            rem = (int)(Math.pow(rem,3));
            n = n / 10;
            sum = sum + rem;
        }
        if(num == sum){
            System.out.println(num+" is an Armstrong Number.");
        }
        else{
            System.out.println(num+" is not an Armstrong Number.");
        }
    }
}
