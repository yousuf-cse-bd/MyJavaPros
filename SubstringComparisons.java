package basicPro;

import java.util.Scanner;

//Java Substring Problem Solve
public class SubstringComparisons {
    //Main Method
    public static void main(String[] args) {

        //Scanner Input Class
        Scanner scanner = new Scanner(System.in);

        String string,rev;
        int index;
        string = scanner.nextLine();
        index = scanner.nextInt();

        StringBuffer stringBuffer = new StringBuffer(string);
        rev = stringBuffer.reverse().toString();
        System.out.println(rev.substring(0,index));
        System.out.println(string.subSequence(0,index));

       /* System.out.println("String: "+string);
        System.out.println("Rev: "+rev);
        System.out.println("StringBuffer: "+stringBuffer);*/
    }
}
