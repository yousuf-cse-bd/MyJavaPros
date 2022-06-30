package basicPro;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n;
        System.out.print("Enter N = ");
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        int n1,n2,n3,i;
        n1 = 0;
        n2 = 1;
        i = 1;
        System.out.print(n1+" "+n2);
        while (i < n -1){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" "+n3);
            i++;
        }
        System.out.println();

    }
}
