package basicPro;

import java.util.Scanner;

//Java Substring Problem Solve
public class Substring {
    //Main Method
    public static void main(String[] args) {
        //Java Input Class
        Scanner scanner = new Scanner(System.in);
        String input;
        int starting, ending;

        input = scanner.nextLine();
        StringBuffer sb = new StringBuffer(input);

        starting = scanner.nextInt();
        ending = scanner.nextInt();

        System.out.println(sb.subSequence(starting,ending));
    }
}
