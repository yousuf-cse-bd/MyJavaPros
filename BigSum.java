package basicPro;

import java.util.Scanner;

public class BigSum {
    /****
     * A Very Big Sum
     * @Author: Muhammad Yousuf Ali
     * @Since: Saturday; 6 July 2019
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N = ?");
        int i,n = scanner.nextInt();

        long sum = 0L;
        for(i = 0; i<n;i++){
            sum = sum + scanner.nextLong();
        }
        scanner.close();
        System.out.println(sum);

      //long num = (long) Math.pow(2,63) - 1;
       // System.out.println(num);

    }
}
