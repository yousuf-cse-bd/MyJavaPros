package yousuf;

import java.util.Scanner;
///Finding a Armstrong Number Program
public class ArmstongNum2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num,rem,sum,n, i;
        sum = 0;

        System.out.println("Enter a value here: ");
        num = scanner.nextInt();
        for(i = 1;i<=num;i++){
            n = i;
            //Separation of DIGIT
            while (n !=0){
                rem = n % 10;
                n = n / 10;
                sum = sum +(int)(Math.pow(rem,3));
            }
            if(i == sum)
                System.out.println(i+" == "+sum+"\tArmstrong Number.");
                sum = 0;
        }

    }
}
