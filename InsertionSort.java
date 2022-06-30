package yousuf;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class InsertionSort {
    /****
     * Simple Queue Implementation
     * @Author: Muhammad Yousuf Ali
     * @Since: TuesDay,3 September 2019
     */

    static void insertionSort(int A[]){
        int item,i,j;
        for (i = 1 ; i<A.length;i++){
            item = A[i];
            j = i - 1;
            while (j>=0 && A[j]>item){
                A[j+1]= A[j];
                j--;
            }
            A[j+1] = item;
        }
    }

    public static void main(String[] args) {

        int i,size;
        System.out.print("Enter Nth = ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

        int [] A;
        A = new int[size];
        i = 0;
        while (i < A.length){
            System.out.print(i+"\tItem = ");
            A[i] = scanner.nextInt();
            i++;
        }

        insertionSort(A);
        System.out.println("\n");
        i = 0;
        do {
            System.out.println(i+"\tItem = "+A[i]);
            i++;
        }while (i<A.length);
    }
}
