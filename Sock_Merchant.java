package Hacker_Rank_Problem_Solving;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sock_Merchant {


    static int sockMerchant(int n, int[] ar) {
        int Count =0;
        List<Integer> list = new ArrayList<>();

        for (int j:list) { System.out.println(j);}
        System.out.println();

        for(int i =0;i<ar.length;i++){
            if(list.contains(ar[i]))
            {
                list.remove(Integer.valueOf(ar[i]));
                Count++;
            }
            else
            {
                list.add(ar[i]);
            }
        }
        return Count;
    }



    public static void main(String[] args){

int a[]={42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42,
        42 ,42 ,42 ,42 ,42};
System.out.println(sockMerchant(a.length,a));

    }
}
