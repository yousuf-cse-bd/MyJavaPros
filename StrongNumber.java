package basicPro;

import java.util.Scanner;

public class StrongNumber {

    static int fact(int x){
        if(x == 1){
            return 1;
        }
        else {
            return x*(fact(x - 1));
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num,sum, n, rem;
        System.out.print("Enter a Value Here: ");
        num = scanner.nextInt();

        n = num;

        sum = 0;
        while (n!=0){
            rem = n % 10;
            n = n / 10;
            sum = sum + fact(rem);
        }
        if(sum == num){
            System.out.println(sum+" :EqualTo: "+num+"\tStrong Number");
        }
        else{
            System.out.println(sum+" :NotEqualTo: "+num+"\tNot Strong Number");
        }

    }
}
