package basicPro;

import java.util.Scanner;

public class Loop_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,t,tmpAns,a,b,n;

        t = scanner.nextInt();
        j = 1;
        while (j<=t){
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            tmpAns = a;
            for(i = 0 ; i<n;i++){
                tmpAns = tmpAns + (int) Math.pow(2,i)*b;
                System.out.print(tmpAns+ " ");
            }
            j++;
            System.out.println();
        }


    }
}
