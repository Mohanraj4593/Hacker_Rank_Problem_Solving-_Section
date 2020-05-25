package Hacker_Rank_Problem_Solving;

import java.util.*;

public class CatAndMouse{

    static String catAndMouse(int x, int y, int z) {
        int CAP=Math.abs(z-x);
        int CBP=Math.abs(z-y);

        if(CBP<CAP){return "Cat B";}

        if(CAP==CBP)
        {return "Mouse C";}

        else{return "Cat C";}
    }



    public static void main(String[] args){
System.out.println(catAndMouse(85 ,66,80));
    }
}
