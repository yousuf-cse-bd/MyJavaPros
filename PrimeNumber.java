package basicPro;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num,i,flag;
        flag = 0;


        System.out.print("Enter a Value Here : ");
        num = scanner.nextInt();
        i = 2;
        while(i<Math.sqrt(num)){
            if(num%i==0){
                flag = 1;
            }
            i++;
        }
        if(flag != 1){
            System.out.println(num +" is a Prime Number.");
        }
        else {
            System.out.println(num +" is not a Prime Number.");
        }
    }




}
