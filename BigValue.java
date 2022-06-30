package basicPro;

import java.util.Scanner;

public class BigValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, size, big, smll;
        System.out.print("Enter Array Size Here : ");
        size = scanner.nextInt();

        int [] A = new int[size];
        for(i = 0; i < A.length;i++){
            System.out.print("Index : ["+i+"]\tItem = ");
            A[i] = scanner.nextInt();
        }

        smll = A[0];
        big = A[0];
        for(i = 1; i<A.length;i++){
            if(big<A[i]){
                big = A[i];
            }
            if(smll>A[i]){
                smll = A[i];
            }
        }

        System.out.println("The Big and Small Values are Respectively :"+big+",\t"+smll);
    }
}
