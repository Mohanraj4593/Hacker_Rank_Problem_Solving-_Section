package Hacker_Rank_Problem_Solving;

import java.util.*;
import static Hacker_Rank_Problem_Solving.Result.gradingStudents;

class Result {

    static int addvalCalculate(int rem,int g)
    { int finalval = 0;
        if (rem==1){finalval=g+4;{return finalval;}}
        else if (rem==2){finalval=g+3;{return finalval;}}
        else if (rem==3){finalval=g+2;{return finalval;}}
        else if (rem==4){finalval=g+1;{return finalval;}}

        return finalval;

    }


    public static List<Integer> gradingStudents(List<Integer> grades)
    {
        ArrayList<Integer> result=new ArrayList<>();
        for (Integer g:grades)
        {
                    int rem=g%5;
                    int addedval=addvalCalculate(rem,g);
                    int difference=addedval-g;

                    if (addedval<40)
                    { result.add(g); }
                    else if (addedval>=40&&difference<3)
                    {result.add(addedval);}
                    else if (addedval>=40&&difference>=3)
                    {
                        result.add(g);
                    }


        }


        return result;
    }

}



public class Grading_Student{
    public static void main(String[] args){

    ArrayList<Integer> li=new ArrayList<>();
        li.add(33);
        li.add(76);
        li.add(20);
        li.add(23);
        li.add(95);
        li.add(7);
        li.add(60);
        li.add(29);
        li.add(70);
        li.add(16);
        li.add(88);
        li.add(93);
        li.add(63);
        li.add(81);
        li.add(29);
        li.add(63);
        li.add(10);
        li.add(88);
        li.add(46);
        li.add(81);
        li.add(22);
        li.add(18);
        li.add(42);
        li.add(90);
        li.add(89);
        li.add(54);
        li.add(32);
        li.add(81);
        li.add(12);
        li.add(90);
        li.add(35);
        li.add(32);
        li.add(91);
        li.add(95);



 System.out.println("Result List is--->"+gradingStudents(li));


    }
}
