package Hacker_Rank_Problem_Solving;

import java.util.*;

public class Bon_Appetite {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0;
        int charged_sum=0;
        int actual=b;

        for(int i=0;i<bill.size();i++)
        { if(i!=k){sum+=bill.get(i);} }

        charged_sum=sum/2;

        if(charged_sum==actual)
        { System.out.println("Bon Appetit");}

        else{System.out.println(actual-charged_sum);}
    }

    public static void main(String[] args){

        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        int k=1;
        int b=7;
        bonAppetit(bill, k, b);

    }
}
