package Hacker_Rank_Problem_Solving;

public class MinimaxProblem {

    static int anotherMinimaxProblem(int[] a) {
        int max=0;
        int result=0;
        for(int i=1;i<a.length;i++)
        {result=a[i]^a[i-1];
            if(result>max)
            {
                max=result;

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[]={1 ,2,3,4};
        System.out.println(anotherMinimaxProblem(a));
    }
}
