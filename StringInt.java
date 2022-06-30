package basicPro;

import java.util.Scanner;

public class StringInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Value :");

        String [] str = new String[3];
        int i;
        for(i = 0; i<str.length;i++){
            str[i] = scanner.nextLine();
        }

        System.out.println("String: "+str[2]);
        double d = Double.parseDouble(str[1]);
        System.out.println("Double: "+d);

        int a = Integer.parseInt(str[0]);
        System.out.println("Int: "+ a);

    }
}
