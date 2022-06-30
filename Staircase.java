package basicPro;

import java.util.Scanner;

public class Staircase {
    /****
     *      #
     *     ##
     *    ###
     *   ####
     * @Author: Muhammad Yousuf Ali
     * @Since: Monday; 8 July 2019
     */

    public static void main(String[] args) {

        int i, j,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N = ?");

        n = scanner.nextInt();
        for(i = 1;i<=n;i++){
            for(j = n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(j = 1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
