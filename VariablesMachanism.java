package basicPro;

public class VariablesMachanism {
    /****
     * Variables all this static & non-static
     * @Autor: Muhammad Yousuf
     * @Since: SunDay; 30 June 2019
     */
    static  byte bt;
    static int a;
    static String s;
    static short st;
    static {
        System.out.println(bt);
        System.out.println(a);
        System.out.println(s);
        System.out.println("Short: "+st);
    }

    int i;
    void showData(){
        System.out.println("I: "+i);
    }
    static double dl;
    static void dlMethod(){
        System.out.println("Dl: "+dl);
    }
    void yousuf(int num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        byte bt;
        short st;
        int i;
        float f;
        double d;
        long l;
        String s;
        boolean bl;

        VariablesMachanism variablesMachanism = new VariablesMachanism();
        variablesMachanism.showData();
        VariablesMachanism.dlMethod();
        variablesMachanism.yousuf(0);


    }
}
