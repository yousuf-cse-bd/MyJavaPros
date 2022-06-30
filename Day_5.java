package basicPro;

import java.util.Scanner;

public class Day_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i;
        n = scanner.nextInt();

        for(i = 1 ; i<=10 ; i++){
            System.out.println(n+" x "+i+" = "+(i*n));
        }
    }
}
