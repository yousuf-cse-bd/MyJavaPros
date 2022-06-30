package basicPro;

import java.util.HashMap;
//HasMap Allows Duplicate Value & Key
public class HasMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> vuCSE = new HashMap<>();

        vuCSE.put(101,"Yousuf");
        vuCSE.put(91,"Faria");
        vuCSE.put(103,"Mustafiz");
        vuCSE.put(105,"Murshid");
        vuCSE.put(101,"Yousuf");

        System.out.println("101 ID: "+vuCSE.get(1));
    }
}
