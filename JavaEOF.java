package basicPro;

import java.util.Scanner;

public class JavaEOF {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            // For loop
           /* for(int i = 1; scan.hasNext()== true; i++){
                System.out.println(i + " " + scan.nextLine());
            }*/

        int i = 1;
        while(scan.hasNext()){

            System.out.println(i +" "+scan.nextLine());
            i++;
        }
    }
}
