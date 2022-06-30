package basicPro;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loop, i;
        loop = scanner.nextInt();
        int [] id = new int[loop];
        double [] c_gpa = new double[loop];
        String [] name = new String[loop];
        i = 0;
        while (i<loop){
            id[i] = scanner.nextInt();
            name[i] = scanner.next();
            c_gpa[i] = scanner.nextDouble();
            i++;
        }

        Arrays.sort(name);
        for(String x:name){
            System.out.println(x);
        }
    }
}
