package basicPro;
import java.util.Scanner;

public class StaticBlock {
    static int B,H;
    static Scanner scanner = new Scanner(System.in);
    static{
        B = scanner.nextInt();
        H = scanner.nextInt();

    }
    public static void main(String[] args){
        System.out.println("B = "+B+"\tH = "+H); //Access Done from Static Variable

        int b = B;
        System.out.println(b);

    }//end of main
}
