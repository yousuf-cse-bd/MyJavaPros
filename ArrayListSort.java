package basicPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {

    public static void main(String[] args) {

        int size, i, input;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size Here: ");
        size = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for(i = 0; i<size;i++){
            System.out.print("Index["+i+"]\tItem = ");
            input =scanner.nextInt();
            numbers.add(input);
        }
        System.out.println("Before Sorting: "+numbers);
        ///Just Sorting ArrayList
        Collections.sort(numbers);
        System.out.println("After Sorting: "+numbers+"Ascending");

        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("After Sorting: "+numbers+"Descending");
    }
}
