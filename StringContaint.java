package basicPro;

public class StringContaint {
    /****
     * Java String
     * @Author: Muhammad Yousuf Ali
     * @Since: FriDay; 5 July 2019
     */

    public static void main(String[] args) {

        String name = "Yousuf";
        System.out.println(name.contains("sf"));
        System.out.println(name.equals("sf"));
        System.out.println(name == "sf");
        System.out.println(name.compareTo("sf"));
        System.out.println(name.compareToIgnoreCase("sf"));
        System.out.println(name.contentEquals("sf"));
        System.out.println(name.matches("sf"));

        //Finally I have not got my expected method
    }
}
