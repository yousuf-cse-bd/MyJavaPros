package basicPro;

import java.util.Scanner;
///Fibonacci Sequence using Array Data Structure
public class FibonacciNext {
    //Main Method
    public static void main(String[] args) {
        //Input Class & its Method Declaration
        Scanner scanner = new Scanner(System.in);

        int size,indexing;
        System.out.print("Enter Nth Number Here: ");
        size = scanner.nextInt();

        int [] A = new int[size];
        A[0] = 0;
        A[1] = 1;
        System.out.print(A[0]+" "+A[1]);
        for(indexing = 2 ; indexing<A.length ; indexing ++){
            A[indexing] = A[indexing - 2] + A[indexing - 1];
            System.out.print(" "+A[indexing]);
        }
        System.out.println();
    }
}
