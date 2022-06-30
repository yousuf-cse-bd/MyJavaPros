package basicPro;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        System.out.print("Enter a value :");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if(n % 2 == 0){
            System.out.println("Entered the value is Even");
        }
        else {
            System.out.println("Entered the value is Odd");
        }
    }
}
