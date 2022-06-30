package basicPro;

import java.util.Scanner;

public class DiagonalDifference {
    /****
     * Diagonal Difference
     * @Author: Muhammad Yousuf Ali
     * @Since: Saturday; 6 July 2019
     */

    public static void main(String[] args) {

        int n,i,j, x, lsumd,rsumd;
        System.out.print("Enter N value Here: ");
        Scanner scanner = new Scanner(System.in);
        x = 0;
        lsumd = 0;
        rsumd = 0;
        n = scanner.nextInt();

        int [][] A = new int[n][n];

        for(i = 0; i<A.length;i++){
            for(j = 0; j<A.length; j++){
                A[i][j] = scanner.nextInt();
                if(i==j){
                    lsumd += A[i][j];
                }
                if((i+j) == A.length - 1){
                    rsumd += A[i][j];
                }
            }
        }



        System.out.println("LSum : "+lsumd);
        System.out.println("RSum : "+rsumd);

        x = Math.abs(lsumd - rsumd);
        System.out.println(x);
    }
}
