package basicPro;

import java.util.Scanner;

public class RevOrderArray {
    /****
     * Reverse Order an Array
     * @Autor: Muhammad Yousuf Ali
     * @Since: WedDay; 3 July 2019
     */


    public static void main(String[] args) {
        int arrSize,i;
        System.out.print("Enter Array Size Here: ");
        Scanner scanner = new Scanner(System.in);

        arrSize = scanner.nextInt();

        int [] A = new int[arrSize];

        for(i = 0; i < A.length; i++){
            System.out.print("Index: ["+i+"]\tItem = ");
            A[i] = scanner.nextInt();
        }

        for(i = A.length - 1 ; i>=0 ; i--){
            System.out.print(A[i]+" ");
        }
    }
}
