package Hacker_Rank_Problem_Solving;

public class Maximizing_XOR {


    static int maximizingXor(int l, int r)
    {
        int maxval=0;
        int xorval=0;
        for(int i=l;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {
                xorval=i^j;
                if(xorval>maxval){maxval=xorval;}
            }

        }
        return maxval;

    }

    public static void main(String[] args) {
        int lower_bound=11;
        int upper_bound=100;
        System.out.println("Max XOR Value: "+maximizingXor(lower_bound,upper_bound));
    }
}
