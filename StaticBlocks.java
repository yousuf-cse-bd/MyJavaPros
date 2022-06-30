package basicPro;

import java.util.Scanner;

public class StaticBlocks {
    static Scanner scanner = new Scanner(System.in);
    static int num1, num2;
    static {
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
    public static void main(String[] args) {


    }
}
