package Hacker_Rank_Problem_Solving;


import java.util.*;

public class The_Hurdle_Race{

    static int hurdleRace(int k, int[] height) {

        int result=0;

        Arrays.sort(height);

        int max=height[height.length-1];
        System.out.println("Max element is: "+max);

        if(max<k){result=0;}
        else{result=max-k;}

        return result;
    }



public static void main(String[] args){

    int[] height={1,6,3,5,2};
    System.out.println("Hurdle result is: "+hurdleRace(4 ,height));
    }}
