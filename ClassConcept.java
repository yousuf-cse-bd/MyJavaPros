package basicPro;

class OOP{
    String name;
    int id;
}

public class ClassConcept {
    /***
     *  Stack implementation using Java
     *  @Author: Muhammad Yousuf
     *  @Since: SatDay; 29 June 2019
     */
    ///main method
    public static void main(String[] args) {

        OOP object = new OOP();
        //init data using Object with OOP class
        object.name = "Muhammad Yousuf";
        object.id = 101;
        ///Show data using object
        /***
         *  but it is not good practise just.
         *  you should use method and constructor
         */
        System.out.println("Name: "+object.name);
        System.out.println("ID: "+object.id);
    }
}
