package basicPro;

class PassByValue{

    public PassByValue(){

    }
    public PassByValue(int x){
        x = 50;
    }
    //Formal ParaMitre
    public void recvValue(int num){
        num = 20;
    }
}
public class CallByValueTest {
    /****
     * Call by value just a java programming
     * @Author: Muhammad Yousuf Ali
     * @Since: TuesDay; 2 July 2019
     */
    ///Main Method
    public static void main(String[] args) {

        int x = 10;
        PassByValue passByValue = new PassByValue();
        ///Actual ParaMitre
        System.out.println("Before Passes the Value: "+x);
        passByValue.recvValue(x);
        System.out.println("\nAfter Passes the Value: "+x);

      //  int p = 55;
        x = 55;

        System.out.println("Using Constructor: "+x);
        /*/Actual ParaMitre*/
        PassByValue ob1 = new PassByValue(x);
        System.out.println("\nLastly Constructor: "+x);
    }
}
