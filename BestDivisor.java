package yousuf;

import java.util.Scanner;

public class BestDivisor {
    /****
     * Best Divisor:
     * @Autor: Muhammad Yousuf Ali
     * @Since: WedDay; 3 July 2019
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num;
        int i, sum = 0;
        System.out.print("Enter a value here: ");
        num = scanner.nextLong();
        for(i = 1; i<=num;i++){
            if(num % i == 0){
                sum ++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
