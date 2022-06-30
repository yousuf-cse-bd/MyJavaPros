package basicPro;

import java.util.Scanner;

public class MatrixFN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r,c,i,j;
        System.out.println("Enter Row and Column :");
        r = scanner.nextInt();
        c = scanner.nextInt();

        double [][] A = new double[r][c];
        System.out.println("Enter First Matrix Elements :");
        for(i = 0; i < r;i++){
            for(j = 0; j < c; j++){
                System.out.print("Index : ["+i+" "+j+"]\tItem = ");
                A[i][j] = scanner.nextDouble();
            }
        }

        double [][] B = new double[r][c];
        System.out.println("Enter Second Matrix Elements :");
        for(i = 0; i < r;i++){
            for(j = 0; j < c; j++){
                System.out.print("Index : ["+i+" "+j+"]\tItem = ");
                B[i][j] = scanner.nextDouble();
            }
        }

        double [][] C = new double[r][c];
        System.out.println("Result :");
        for( i = 0 ; i < r; i++){
            for(j = 0;j<c;j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+"\t\t");
            }
            System.out.println();
        }

        if(r == 3 && c == 3){
            float x1,y1,z1;
            float x2, y2, z2;
            float x3, y3, z3;

            float x,y,z,sum = 0;
            x =(float)(C[0][0]*(C[1][1]*C[2][2] - C[2][1]*C[1][2]));
            y = (float)(C[0][1]*(C[1][0]*C[2][2]- C[2][0]*C[1][2]));
            z = (float)(C[0][2]*(C[1][0]*C[2][1] - C[1][1]*C[2][0]));
            sum = x - y + z;
            System.out.println("\nMatrix Determine = "+sum);
            if(sum == 0){
                System.out.println("The Matrix is Singular Matrix.");
            }
            else{
                System.out.println("You've to Find Out Inverse Matrix.");
            }

        }
        else {
            System.out.println("\nI can Matrix Determine Just 3x3.");
        }
    }
}
