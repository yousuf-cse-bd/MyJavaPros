package basicPro;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter a Value Here : ");
        num = scanner.nextInt();

        int rem, sum = 0;
        while(num !=0){
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;

        }
        System.out.println("The Sum of Digit : "+ sum);
    }
}
