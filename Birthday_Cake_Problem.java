package Hacker_Rank_Problem_Solving;

public class Birthday_Cake_Problem {

    static int birthdayCakeCandles(int[] ar) {
        int count=0;
        int max=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if (ar[i]>max)
                max=ar[i];
        }

        for(int j=0;j<ar.length;j++)
        {
            if (ar[j]==max)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    int arr[]={18,90,90,13,90,75,90,8,90,43};

    System.out.println(birthdayCakeCandles(arr));


    }
}
