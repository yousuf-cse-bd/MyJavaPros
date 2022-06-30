package basicPro;

import java.util.LinkedList;
import java.util.Scanner;

public class PrintLinkdList {
    /****
     * Print the Elements of a Linked List
     * @Autor: Muhammad Yousuf Ali
     * @Since: WedDay; 3 July 2019
     */
    public static void main(String[] args) {

        int n;
        System.out.print("Enter N = ?");
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        LinkedList<Integer> ob = new LinkedList<>();
        for(int i = 0; i<n;i++){
            int tmp;
            tmp = scanner.nextInt();
            ob.add(tmp);
        }

        for(Integer x : ob){
            System.out.println(x);
        }
    }
}
