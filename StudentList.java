package basicPro;

import java.util.LinkedList;

class List{
    int id;
    String name;
    double cGpa;

    public List(int id, String name, double cGpa){
        this.name = name;
        this.id = id;
        this.cGpa = cGpa;
    }
}

public class StudentList {

    public static void main(String[] args) {

        LinkedList<List> ob = new LinkedList<>();

        List l1 = new List(101,"Yousuf",3.33);
        List l2 = new List(105,"Al-Murshid",3.50);
        List l3 = new List(103,"Mustafiz",3.45);

        ob.add(l1);
        ob.add(l2);
        ob.add(l3);

        System.out.println("ID\tName\tGPA");
        for(List list : ob){
            System.out.println(list.id+"\t"+list.name+"\t"+list.cGpa);
        }
    }
}
