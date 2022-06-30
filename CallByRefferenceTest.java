package basicPro;

class CallByRefernce{
    String name;
    public void change(CallByRefernce ob2){
        ob2.name = "Yousuf";
    }
}

public class CallByRefferenceTest {
    /***
     * Call by reference just a java programming
     * @Author: Muhammad Yousuf Ali
     * @Since: TuesDay; 2 July 2019
     */

    //init Main Method
    public static void main(String[] args) {

        CallByRefernce ob1 = new CallByRefernce();
        ob1.name = "Muhammad";
        System.out.println("Before Passing: "+ob1.name);
        ob1.change(ob1);
        System.out.println("After Passing: "+ob1.name);
    }
}
