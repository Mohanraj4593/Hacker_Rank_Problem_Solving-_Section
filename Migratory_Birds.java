package Hacker_Rank_Problem_Solving;

import java.io.*;
import java.util.*;

public class Migratory_Birds{

    static void migratoryBirds(List<Integer> arr) {
   Collections.sort(arr);

   int ac[]=new int[arr.size()];
   for (int j=0;j<ac.length;j++){ac[j]=0;}

   for (int i=0;i<arr.size();i++)
    {
        if (arr.get(i)==1){++ac[0];}
        else if (arr.get(i)==2){++ac[1];}
        else if (arr.get(i)==3){++ac[2];}
        else if (arr.get(i)==4){++ac[3];}
        else if (arr.get(i)==5){++ac[4];}
    }
        for (int i:ac) {
            System.out.print(i+" ");
        }


    }

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
            l.add(1);
            l.add(2);
            l.add(3);
            l.add(4);
            l.add(5);
            l.add(4);
        l.add(3);
        l.add(2);l.add(1);
        l.add(3);l.add(4);


         migratoryBirds(l);
    }
}
