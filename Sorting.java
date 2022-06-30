package basicPro;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size, i,j, count,tmp;
        count = 0;
        size = scanner.nextInt();
        int [] A = new int[size];
        i = 0;
        while(i<A.length){
            A[i] = scanner.nextInt();
            i++;
        }

        for(i = 0; i<A.length - 1;i++){
            for(j = i + 1;j<A.length;j++){
                if(A[i]>A[j]){
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    count++;
                }
            }
        }

        System.out.println("Array is sorted in " +count+ " swaps.");
        System.out.println("First Element: "+A[0]);
        System.out.println("Last Element: "+A[A.length-1]);
    }
}
