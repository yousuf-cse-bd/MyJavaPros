package basicPro;

import java.util.Scanner;

public class OutPutFormate {

    public static void main(String[] args) {

        String str ;
        int i,x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for(i = 0; i <3;i++){

            str = scanner.next();
            x = scanner.nextInt();

            System.out.printf("%-15s%03d\n", str, x);
        }
        System.out.println("================================");
    }
}
