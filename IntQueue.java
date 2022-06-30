package yousuf;

import java.util.Scanner;

public class IntQueue {
    /****
     * Simple Queue Implementation
     * @Author: Muhammad Yousuf Ali
     * @Since: TuesDay,3 September 2019
     */

    private int [] q;
    private int size;
    private int total,front, rear;

    public IntQueue(){
       size = 10;
       total = 0;
       front = 0;
       rear = 0;
       q = new int[size];
    }

//    public IntQueue(int size){
//        this.size = 10;
//        total = 0;
//        front = 0;
//        rear = 0;
//        q = new int[this.size];
//    }

    public boolean enqueue(int item){
        if(isFull()){
            return false;
        }
        else {
            total ++;
            q[rear] = item;
            rear ++;
            return true;
        }
    }

    public int dequeue(){
        int item = q[front];
        total --;
        front ++;
        return item;
    }


    public boolean isFull(){
        if(size == total){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue q = new IntQueue();

        int item, i;
        i = 1;
        while (i<=10){
            System.out.print("Enter a New Item: ");
            item = scanner.nextInt();
            q.enqueue(item);
            i++;
        }
        for (i = 1;i<=10;i++){
            System.out.println(q.dequeue());
        }
    }
}
