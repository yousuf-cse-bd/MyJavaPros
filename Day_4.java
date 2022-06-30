package basicPro;


import java.util.Scanner;

public class Day_4{
    int age = 0;
    public Day_4(int initAge){
        age = initAge;
        if(age<0){
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void iAmOlld(){
        if(age<13){
            System.out.println("You are young.");
        }
        else if(age >= 13 && age<18){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
    }

    public void passYear(){
        age++;
    }

    public static void main(String[] args) {

        int age,i , t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        i = 1;
        while(i<=t){
            age = scanner.nextInt();
            Day_4 object = new Day_4(age);
            object.iAmOlld();
            for (int j = 1; j <=3;j++){
                object.passYear();
            }
            object.iAmOlld();
            System.out.println();
            i++;
        }


    }
}
