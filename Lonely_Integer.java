package Hacker_Rank_Problem_Solving;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lonely_Integer {

static int lonely_integer_calculator(int[] ar)
{   int result=0;
    for (int a:ar){result=result^a;}
    return result;
}




    public static void main(String[] args) {
        int[] ar ={0,0,1,2,1};


        System.out.println("Lonely Element is: "+lonely_integer_calculator(ar));
    }


}
