package basicPro;

public class VarLengthArg {
    /****
     * Call By Reference using Single Class
     * @Author: Muhammad Yousuf Ali
     * @Since: TuesDay; 2 July 2019
     */
    int sum = 0;
    ///All arguments accept
    public void sumof(int...num){
        for(int x : num){
            sum = sum + x;
            System.out.println("Sum: "+sum);

        }
        sum = 0;
    }
    public static void main(String[] args) {

        VarLengthArg varLengthArg = new VarLengthArg();
        varLengthArg.sumof(10);
        varLengthArg.sumof(10,20);
    }
}
