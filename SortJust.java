package basicPro;

//import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Students implements Comparable{
    private int id;
    private String fname;
    private double cgpa;
    public Students(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    //More Practice Yousuf
  @Override
    public int compareTo(Object o) {

        Students s = (Students) o;
        if(cgpa == s.cgpa){
            if(fname.equals(s.fname)){
                return id-s.id;
            }else{
                return fname.compareTo(s.fname);
            }
        }else {
            if(s.cgpa - cgpa>0)
                return 1;

            else
                return -1;
        }
    }
}

public class SortJust {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase, i;
        System.out.print("Enter TestCase: ");
        testCase = scanner.nextInt();

        ArrayList<Students> stList = new ArrayList<>();
        int id;
        String name;
        double gpa;
        while (testCase>0){
            id = scanner.nextInt();
            name = scanner.next();
            gpa = scanner.nextDouble();
            Students studentsOb= new Students(id,name,gpa);
            stList.add(studentsOb);
            testCase--;
        }

        Collections.sort(stList);
        for(Students sortName : stList){
            System.out.println(sortName.getFname());
        }

    }
}
