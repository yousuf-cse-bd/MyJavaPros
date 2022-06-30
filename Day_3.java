package basicPro;
import java.util.Scanner;

public class Day_3 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a value :");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if(n % 2 ==1){
            System.out.println("Weird");
        }
        else if(n >=2 && n<=5 && n % 2 == 0 ){
            System.out.println("Not Weird");
        }
        else if(n >=6 && n<=20 && n % 2 == 0){
            System.out.println("Weird");
        }
        else if(n>20 && n % 2 == 0){
            System.out.println("Not Weird");
        }

        sc.close();


    }
}
