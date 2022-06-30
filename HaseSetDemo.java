package basicPro;

import java.util.HashSet;

public class HaseSetDemo {
    public static void main(String[] args) {

        HashSet<String > friutName = new HashSet<>();

        friutName.add("Apple");
        friutName.add("Banana");
        friutName.add("Palm");
        friutName.add("Orange");

        System.out.println(friutName);
        System.out.println(friutName.size());

        for (String X : friutName){
            System.out.println(X);
        }
    }
}
