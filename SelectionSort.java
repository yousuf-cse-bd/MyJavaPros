package basicPro;

//import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class SelectionSort {

    static void selectionSort(double[] A, int n){
        ///Logic implementation
        int i, j;
        for(i = 0; i < A.length -1 ; i++){
            for(j = i+1;j<A.length; j++){
                //Just Swapping
                if(A[i]>A[j]){
                    A[i] = A[i] + A[j];
                    A[j] = A[i] - A[j];
                    A[i] = A[i] - A[j];
                }
            }
        }
        ///OutPut on Console
        System.out.println("\nSorting Ascending Order Below :");
        for(i = 0;i<A.length;i++){
            System.out.println("Index : "+i+"\tItem = "+A[i]);
        }

    }

    public static void main(String[] args) {

        int i,n;
        System.out.print("Enter N = ");
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        ///Just Input Item
        double [] A = new double[n];
        for(i = 0; i < A.length;i++){
            System.out.print("Index : "+i+"\tItem = ");
            A[i] = scanner.nextDouble();
        }

        selectionSort(A,A.length);

    }
}
