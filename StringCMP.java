package basicPro;

public class StringCMP {
    public static void main(String[] args) {
        //compareTo method works ASCII values
        String str = "A";
        System.out.println(str.compareTo("a"));

        String firstName = "Muhammad";
        String lastMame = " Yousuf";
        ///String Concat Method Application
        System.out.println(firstName.concat(lastMame.concat(" Ali")));
    }
}
