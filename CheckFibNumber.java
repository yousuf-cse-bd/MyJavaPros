package basicPro;

import java.util.Scanner;

//Checking a value Fibonacci Number
public class CheckFibNumber {
    ///Main Method
    public static void main(String[] args) {
        //Input Class & its Application
        Scanner scanner = new Scanner(System.in);
        //Vars Declaration
        int size, indexing ;
        boolean b = false;
        System.out.print("Enter Your Number Here: ");
        size = scanner.nextInt();

        int[] A = new int[size + 2];
        A[0] = 0;
        A[1] = 1;
        indexing = 2;
        while (indexing<A.length){
            A[indexing] = A[indexing - 2] + A[indexing -1];
            indexing++;
        }
        //Comparing Entered Number and FibSequence
        for(indexing = 0; indexing<A.length;indexing++){
           System.out.print(A[indexing]+" ");
            if(A[indexing] == size){
                b = true;
            }
        }
        System.out.println();
        //Flag Var
        if (b == true){
            System.out.println(size +" number is Fibonacci");
        }
        else {
            System.out.println(size +" number is not Fibonacci");
        }

    }
}
