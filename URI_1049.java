package basicPro;

import java.util.Scanner;

public class URI_1049 {

    public static void main(String[] args) {

        String [] str = new String[3];

        Scanner scanner = new Scanner(System.in);
        str[0] = scanner.next();
        str[1] = scanner.next();
        str[2] = scanner.next();
        ///First Part
        if(str[0].equals("vertebrado")){

            if(str[1].equals("ave")){
                if(str[2].equals("carnivoro")){
                    System.out.println("aguia");
                }
                else if(str[2].equals("onivoro")){
                    System.out.println("pomba");
                }
            }
            else if(str[1].equals("mamifero")){
                if(str[2].equals("onivoro")){
                    System.out.println("homen");
                }
                else if(str[2].equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }

        ///Next Part
        else if(str[0].equals("invertebrado")){
            if(str[1].equals("inseto")){
                if(str[2].equals("hematofago")){
                    System.out.println("pulga");
                }
                else if(str[2].equals("herbivoro"))
                {
                    System.out.println("lagarta");
                }
            }
            else if(str[1].equals("anelideo")){
                if(str[2].equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else if(str[2].equals("onivoro"))
                {
                    System.out.println("minhoca");
                }
            }
        }

    }
}
