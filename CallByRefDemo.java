package basicPro;

public class CallByRefDemo {
    /****
     * Call By Reference using Single Class
     * @Author: Muhammad Yousuf Ali
     * @Since: TuesDay; 2 July 2019
     */
    String name;
    void cnaged(CallByRefDemo objectPass){
        objectPass.name = "Yousuf";
        System.out.println("Name: "+objectPass.name);
        System.out.println("Direct: "+name);
    }
    public static void main(String[] args) {

        CallByRefDemo object = new CallByRefDemo();
        object.name = "Muhammad";
        System.out.println("Before Passes: "+object.name);
        object.cnaged(object);
        System.out.println("After Passes: "+object.name);
    }
}
