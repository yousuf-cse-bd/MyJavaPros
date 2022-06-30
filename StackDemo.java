package basicPro;

import java.util.Scanner;

public class StackDemo {
    /***
     * Stack implementation using Java
     * @Author: Muhammad Yousuf
     * @Since: SatDay; 29 June 2019
     */
    //init variables
    static int[] stack = new int[10];
    static int top = -1;
    ///push(), pop(),display 3 method
    static void pushmethod(int value){
        if(top == 9) {
            System.out.println("Stack is Full/Overflow");
        }
        else {
            top++;
            stack[top] = value;
        }
    }
    static void popMethod(){
        if(top < 0) {
            System.out.println("Stack is Underflow");
        }
        else {
            stack[top] = stack[top--];
            System.out.println("Delete the Top Item.");
        }
    }
    static void showStack(){
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println("Index[" + i + "] = " + stack[i]);
            }
        }

    }
    //Main Method
    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);
        int num;
        short option;
        do {
            System.out.println("**********:Main Menu:**********");
            System.out.println("1 for Load Stack.");
            System.out.println("2 for Delete Stack.");
            System.out.println("3 for Display Elements.");
            System.out.println("0 for Exit....!");
            System.out.print("Choose Option Here: ");
            option = scanner.nextShort();
            ///casing job
            switch (option){
                case 1:
                    System.out.print("Enter a New Value Here: ");
                    num = scanner.nextInt();
                    pushmethod(num);
                    break;
                case 2:
                    popMethod();
                    break;
                case 3:
                    showStack();
                    break;
                case 0:
                    System.out.println("EXIT...!");
                    break;
                    default:
                    System.out.println("Choose the Right Option...?");
            }

        }while (option!=0);

    }
}
