package basicPro;

import java.util.Scanner;

public class GradingStudents {
    /****
     * Grading Students
     * @Author: Muhammad Yousuf Ali
     * @Since: MonDay; 8 July
     */

    public static void main(String[] args) {

        int n, grade, g = 0;
        System.out.print("Enter N = ?");
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        while (n>0){
            System.out.print("Enter Grade Here: ");
            grade = scanner.nextInt();

           for(int i = 0;i<=90; i = i + 5){
               if(i - grade < 3){
                   System.out.println("I = "+i);
                   g = i;
               }
               else if(i - grade <= 3 || grade<35){
                   System.out.println("i : "+i);
                   g = grade;
               }
               else if(grade>90){
                   g = grade;
               }
           }
            System.out.println(g);
            g = 0;
            n--;
        }

    }
}
