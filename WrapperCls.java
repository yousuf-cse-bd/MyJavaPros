package basicPro;
///Wrapper Class Autoboxing and unboxing
public class WrapperCls {

    //Main Method
    public static void main(String[] args) {
    //Primitive to Object
        int value = 101;
        //Autoboxing using method
        Integer valueOb = Integer.valueOf(value);

        System.out.println("Integer Object Value: "+valueOb);

        Integer drct = value; //Compiler Works Integer.valueOf(value);
        System.out.println("Again Object Value: "+drct);
        //int to Double autoboxing
        Double ob = Double.valueOf(value);
        System.out.println("\nDouble Object Value: "+ob);

        //Now Object to Primitive
        //Unboxing Exercise/Example
        Double PI = new Double(3.14159265359);

        double piValue = Double.valueOf(PI);
        System.out.println("\nPI Value: "+piValue);

        //Most importance CODE
        //int -> String

        int number = 101;
        String string = Integer.toString(number);
        System.out.println("Now String: "+string+"\tand Length: "+string.length());
        //Now String -> int

        String s = "2019";
        int yy = Integer.parseInt(s); //Normal Method
        System.out.println("YY: "+yy);
        int yyr = Integer.valueOf(s);//Good Method & Good Practice
        System.out.println("Another Method: "+yyr);
        System.out.println("Added Them: "+(yy+yyr));

    }
}
