package basicPro;


import java.util.Scanner;

public class DatedClass {
    /****
     *
     * Calculate the day of the week for particular date
     *
     * @Autor Muhammad Yousuf
     * @Since SatDay 29 June 2019
     */
    public static void main(String[] args){

    //init
        Scanner scanner = new Scanner(System.in);
        int month, day, year;
    //Input Month/Day/Year from user
        System.out.print("Enter Month Here: ");
        month = scanner.nextInt();

        System.out.print("Enter Day Here: ");
        day = scanner.nextInt();
        System.out.print("Enter Year Here: ");
        year = scanner.nextInt();

        scanner.close();

    }
}
