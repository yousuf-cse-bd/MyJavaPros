package basicPro;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str;

        str = scanner.nextLine();

        System.out.println("Hello, World.\n"+str);
    }
}
