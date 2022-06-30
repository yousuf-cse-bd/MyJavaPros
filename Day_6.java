package basicPro;

import java.util.Scanner;

public class Day_6 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int testCase, i,j;
        String s ;
        i = 1;
        testCase = scanner.nextInt();
        while(i<=testCase){

            s = scanner.next();
            char [] ch = s.toCharArray();
            for( j = 0; j < s.length();j = j + 2){
                   System.out.print(ch[j]);

            }
            System.out.print(" ");
            for( j = 1; j < s.length();j= j+2){

                    System.out.print(ch[j]);
            }
            System.out.println();
            i++;
        }

    }
}
