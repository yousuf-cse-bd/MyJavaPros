package yousuf;

import java.util.Scanner;

public class InsertioSortNext {
    //logic
    int[] sort(int [] Ar){

        int i,j,item;
        for(i = 1 ; i<Ar.length; i++)
        {
            item = Ar[i];
            j = i - 1;
            while (j>=0 && Ar[j]>item)
            {
                Ar[j+1] = Ar[j];
                j--;
            }
            Ar[j+1] = item;
        }

        return Ar;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InsertioSortNext insertioSortNext = new InsertioSortNext();
        //input
        int N, i;
        System.out.print("Enter Nth Here: ");
        N = scanner.nextInt();
        int A [] = new int[N];
        i = 0;
        while (i<A.length)
        {
            System.out.print("Index : "+i+"\tItem = ");
            A[i] = scanner.nextInt();
            i++;
        }
        insertioSortNext.sort(A);
        System.out.println();
        //output
        i = 0;
        do {
            System.out.println("Item : "+i+"\tItem = "+A[i]);
            i++;
        }while (i<A.length);

    }
}
