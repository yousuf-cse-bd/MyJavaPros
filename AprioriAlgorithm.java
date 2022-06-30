//package yousuf;

import java.util.Scanner;

public class AprioriAlgorithm {
    /****
     * Apriori Algorithm Implementation using Java
     * @Author: Muhammad Yousuf Ali
     * @Since: FriDay; 5 July 2019
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       // System.out.print("Transaction Number = ?");

        int tr,i ,j,itemCountA,itemCountB,itemCountC,itemCountD,itemCountE,itemCountF;
        double minSup, minConf;
        //tr = scanner.nextInt();
        tr = 4;
       String [] itemSet = {"ABC","AC","AD","BEF"};

        /*System.out.println("Input Items Set: ");
        for(i = 0; i<itemSet.length;i++){
            System.out.print("Transaction:["+i+"]\tItems = ");
            itemSet[i] = scanner.next();
        }*/
        //Transaction Table
        System.out.println("\nItem Set:");
        for(i = 0; i < itemSet.length; i++){
            System.out.println("Transaction:["+i+"]\tItems = "+itemSet[i]);
        }



        //System.out.println("A : "+itemSet[3].charAt(0));
        //Table 3 Candidate(C1) Items and Support Finding
        itemCountA = 0;
        itemCountB = 0;
        itemCountC = 0;
        itemCountD = 0;
        itemCountE = 0;
        itemCountF = 0;
       for(i = 0; i<itemSet.length;i++){
            if(itemSet[i].contains("A")){
                itemCountA ++;
            }
            if(itemSet[i].contains("B")){
                itemCountB ++;
            }
            if(itemSet[i].contains("C")){
                itemCountC ++;
            }
            if(itemSet[i].contains("D")) {
                itemCountD++;
            }
            if(itemSet[i].contains("E")){
               ++itemCountE;
           }
            if(itemSet[i].contains("F")){
               ++itemCountF;
           }
       }
        System.out.println("{Item Set}\tSupport:C1");
        System.out.println("{A}\t\t\t"+(itemCountA));
        System.out.println("{B}\t\t\t"+(itemCountB));
        System.out.println("{C}\t\t\t"+(itemCountC));
        System.out.println("{D}\t\t\t"+(itemCountD));
        System.out.println("{E}\t\t\t"+(itemCountE));
        System.out.println("{F}\t\t\t"+(itemCountF));

        ///L1 Table Chart

        System.out.println("\n{Item Set}\tSupport:L1");
        System.out.println("{A}\t\t\t"+(itemCountA));
        System.out.println("{B}\t\t\t"+(itemCountB));
        System.out.println("{C}\t\t\t"+(itemCountC));

        //Candidate: C2 implementation
        int  itemCountAB  = 0;
        int  itemCountBC = 0;
        int  itemCountAC = 0;
        for(i = 0; i<itemSet.length ;i++){
            if(itemSet[i].contains("ABC") || itemSet[i].contains("AB")){
                itemCountAB ++;
            }
            if(itemSet[i].contains("BC") ||itemSet[i].contains("ABC")){
                itemCountBC ++;
            }
            if(itemSet[i].contains("AC") || itemSet[i].contains("ABC")){
                itemCountAC ++;
            }
        }
        System.out.println("\n{Item Set}\tSupport:C2");
        System.out.println("{AB}\t\t"+(itemCountAB));
        System.out.println("{BC}\t\t"+(itemCountBC));
        System.out.println("{AC}\t\t"+(itemCountAC));

        ///L2
        System.out.println("\n{Item Set}\tSupport:L2");
        System.out.println("{AC}\t\t"+(itemCountAC));

        System.out.print("\nGive Here Minimum Support(%): ");
        minSup = scanner.nextDouble();

        minSup = (minSup * tr)/100;
        System.out.print("\nNow Minimum Confidence Here(%): ");
        minSup = scanner.nextDouble();

        minConf = (minSup * tr)/100;

    /// A ->> C = (minSupport)/(Occurs of total A );
        System.out.println("\nAssociationRules:\tSupport:\tConfidence:\tConfidence(%):");
        System.out.println("A->C\t"+minSup+"\t"+(minConf/itemCountA)+"\t"+(minConf/itemCountA)*100+"%");
        System.out.println("C->A\t"+minSup+"\t"+(minConf/itemCountC)+"\t"+(minConf/itemCountC)*100+"%");
    }
}
