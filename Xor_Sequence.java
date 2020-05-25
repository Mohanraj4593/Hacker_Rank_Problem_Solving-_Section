package Hacker_Rank_Problem_Solving;


public class Xor_Sequence {

    static long xorSequence(long l, long r) {


        long[] a=new long[(int) (r+1)];
        a[0]=0;
        long result=0;

        for (long i=1;i<=r;i++)
        { a[(int) i]=a[(int) (i-1)]^i;
        }

        for (long k=0;k<a.length;k++)
        {
            System.out.print(a[(int) k]+" ");
        }
        System.out.println();
        for (long j=l;j<=r;j++)
        {result^=a[(int) j];}

            return result;
    }


    public static void main(String[] args){
   System.out.println(xorSequence(4,6));





    }
}
