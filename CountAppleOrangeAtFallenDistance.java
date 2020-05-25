package Hacker_Rank_Problem_Solving;

import java.util.*;

public class CountAppleOrangeAtFallenDistance{

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples,
                                      int[] oranges) {
        int applecount=0;
        int orangecount=0;

        for(int i=0;i<apples.length;i++)
        {
            apples[i]=a+apples[i];
        }

        for(int j=0;j<oranges.length;j++)
        {
            oranges[j]=b+oranges[j];
        }

        for(int k=0;k<apples.length;k++)
        {
            if(apples[k]>=s && apples[k]<=t)
            {
                applecount++;
            }
        }

        for(int l=0;l<oranges.length;l++)
        {
            if(oranges[l]>=s && oranges[l]<=t)
            {
                orangecount++;
            }
        }

        System.out.println("Apple Count in the range of: "+s+" and "+t+"-->"+applecount);
        System.out.println("Orange Count n the range of: "+s+" and "+t+"-->"+orangecount);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the S and T value with sapce");
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        System.out.println("Enter the a and b value with space");
        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        System.out.println("Enter the m and n value with space");
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        System.out.println("Enter apple fell at d distance with space");

        for (int i = 0; i < m; i++) {
            apples[i] = scanner.nextInt();
        }

        int[] oranges = new int[n];

        System.out.println("Enter oranges fell at d distance with space");

        for (int i = 0; i < n; i++) {
            oranges[i] = scanner.nextInt();
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
