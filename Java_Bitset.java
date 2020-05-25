package Hacker_Rank_Problem_Solving;

import java.util.*;

public class Java_Bitset {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the bitset");
        int m=sc.nextInt();
        System.out.println("enter the number of operations");
        int n=sc.nextInt();

        BitSet b1 = new BitSet(m);
        BitSet b2 = new BitSet(m);

        System.out.println("Enter the operation you want to perform");
        String op=sc.next();

        System.out.println("Enter the 1st input");
        int x=sc.nextInt();

        System.out.println("Enter the 2nd input");
        int y=sc.nextInt();

        for(int l=0;l<n;l++){
            if(op.equals("AND")){
                if(x==1) b1.and(b2);
                else b2.and(b1);
            }else if(op.equals("OR")){
                if(x==1) b1.or(b2);
                else b2.or(b1);
            }else if(op.equals("XOR")){
                if(x==1) b1.xor(b2);
                else b2.xor(b1);
            }else if(op.equals("FLIP")){
                if(x==1) b1.flip(y);
                else b2.flip(y);
            }else if(op.equals("SET")){
                if(x==1) b1.set(y);
                else b2.set(y);
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}
