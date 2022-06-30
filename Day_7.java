package basicPro;

import java.util.Scanner;

public class Day_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size, i;
        size = scanner.nextInt();

        int[] A = new int[size];
        for(i  = 0; i <size;i++){
            A[i] = scanner.nextInt();
        }
        for(i = size - 1 ; i>=0;i--){
            System.out.print(A[i]+" ");
        }
    }
}
