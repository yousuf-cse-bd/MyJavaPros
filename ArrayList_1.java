package yousuf;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList_1 {

    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList();

        System.out.println("Init Size: "+list1.size());
        //you can load Elements this Method
        /*list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(0,40);*/

        int i,j, size,tmp;
        System.out.println("Enter N = ?");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

        for(i = 0; i<size;i++){

            System.out.print("Index: "+i+"\tItem = ");
            tmp = scanner.nextInt();
            list1.add(tmp);
        }

        //foreach loop
        for(int x:list1){
            System.out.println(x);
        }
        System.out.println("After Load Size: "+list1.size());


        System.out.println(list1.isEmpty());

    }
}
