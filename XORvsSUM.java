package Hacker_Rank_Problem_Solving;

public class XORvsSUM {

    static long sumXor(long n) {
    long i=0;
    int count=0;

    while(i!=n)
    {

    if((n+i)==(n^i))
    {count++;}
        i++;
    }
    return count;
    }

    public static void main(String[] args) {

        System.out.println(sumXor(5));


    }
}
