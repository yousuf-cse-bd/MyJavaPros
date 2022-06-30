package basicPro;

import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i,j,count = 0;
        int  n = scanner.nextInt();
        int [] A = new int[n];

        for(i = 0;i<n;i++){
            A[i] = scanner.nextInt();
        }

       /* for(i = 0; i<n-1;i++){
            for(j = 0;j<n-(i+1);j++){
                if(A[j]>A[j+1]){
                    A[j] = A[j]+A[j+1];

                    A[j+1] = A[j] - A[j+1];

                    A[j] = A[j] - A[j+1];
                }
            }
        }*/

        for(i = 0 ; i < n-1; i ++){
            if(A[i] == A[i+1]){
                count++;
            }
        }
        System.out.println(count);

    }
}
