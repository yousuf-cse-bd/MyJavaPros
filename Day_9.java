package basicPro;

import java.util.Scanner;

public class Day_9 {

    ///Recursion Method
    static int factorial(int n){
        if(n == 1)
            return 1;
        else
            return n*(factorial(n - 1));
    }
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.println(factorial(n));
    }
}
