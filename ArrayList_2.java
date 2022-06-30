package yousuf;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_2 {

    public static void main(String[] args) {

      ArrayList<String> countryName = new ArrayList<>();

       countryName.add("Bangladesh");
       countryName.add("Pakistan");
       countryName.add("India");
       countryName.add("Nepal");
       countryName.add("Maldive");

       ///using foreach loop
        for(String country:countryName){
            System.out.println(country);
        }

        System.out.println("Before Sorting: "+countryName);
       Collections.sort(countryName);

        System.out.println("After Soring: "+countryName+" Asc");
       Collections.sort(countryName,Collections.reverseOrder());
        System.out.println("After Sorting: "+countryName+" Dec");

    }
}
