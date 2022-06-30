package basicPro;

import java.util.Scanner;

class Persion{


}

public class Student extends Persion {

    int i ;
    float result = 0;
    public Student(String firstName, String lastName, int id, int[] score){

        for(i = 0; i<score.length;i++){
            result = result + score[i];
        }

        result = result / i;
        System.out.println("Name: "+lastName+", "+firstName);
        System.out.println("ID: "+id);
    }

    char calculate (){
        char grade;
        if(90<=result && result<=100){
            grade = 'O';
        }
        else if(80<result && result<90){
            grade = 'E';
        }
        else if(70<= result && result<80){
            grade = 'A';
        }
        else if(55 <= result && result <70){
            grade = 'P';
        }
        else if(result <= 40 && result < 55){
            grade = 'D';
        }
        else{
            grade = 'T';
        }

        return grade;
    }

    public static void main(String[] args) {

        String firstName, lastName;
        int id,size,i;
        Scanner scanner = new Scanner(System.in);

        firstName = scanner.next();
        lastName = scanner.next();
        id = scanner.nextInt();
        size = scanner.nextInt();

        int [] score = new int[size];
        for(i = 0; i < size; i++){
            score[i] = scanner.nextInt();
        }

        Student ob = new Student(firstName,lastName,id,score);

        System.out.println("Grade: "+ob.calculate());
    }
}
