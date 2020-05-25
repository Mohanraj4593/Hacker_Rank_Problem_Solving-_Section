package Hacker_Rank_Problem_Solving;
import java.util.*;

public class ListProgramme {

    public static void main(String[] args) {

        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        //Number of elements you want ot insert
        System.out.println("enter the number of inputs");
        int ti=sc.nextInt();
        for(int i=0;i<ti;i++)
        {
            int input=sc.nextInt();
            l.add(input);
        }

        int query=sc.nextInt();
        for(int j=0;j<query;j++)
        {
            String option=sc.next();
            if(option=="Insert")
            {
                int val=sc.nextInt();
                int index=sc.nextInt();
                l.add(val,index);
            }
            else
            {
                int num=sc.nextInt();
                l.remove(num);
            }
        }
        for(int values:l)
            System.out.print(values);



    }
}
