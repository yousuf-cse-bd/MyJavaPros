package basicPro;

import java.util.Scanner;

public class InputOutput {
    /****
     * Input and Output no extra variable
     * @Author: Muhammad Yousuf Ali
     * @Since: Friday; 5 July 2019
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter a String Here: ");
            System.out.println(scanner.nextLine());
        }
    }
}
