package Hacker_Rank_Problem_Solving;

/* import java.math.BigDecimal;
import java.util.*;
class Java_BigDecimal{

   public static void main(String []args){
        //Input
ArrayList a=new ArrayList();

        String []s={"-100","50", "0","56.6","90","0.12",".12","02.34","000.000"};
        for(int i=0;i<s.length;i++)
        {
a.add(s[i]);
        }


Collections.sort(a);
        Collections.reverse(a);


        //Output

            System.out.print(a);

    }


} */

import java.io.*;

class Java_BigDecimal
{
    @SuppressWarnings("deprecation")
    public void file() throws Exception
    {
        String path ="E:\\ABC prog FOLDER\\BANKPRO\\S.txt";
        FileInputStream fi = new FileInputStream(path);
        DataInputStream di = new DataInputStream(fi);
        ObjectInputStream oi = new ObjectInputStream(fi);
        System.out.println(oi.readObject());
        System.out.println(oi.toString());

        System.out.println(di.toString());
        //System.out.println((B2)di.readObject());

		/*for(int i=0;i<br.readLine().length();i++)
		{
			System.out.println(temp);
			temp=temp+br.readLine().substring(i,i+1)+" ";
		}
		System.out.println(temp);
		StringTokenizer s =new StringTokenizer(br.readLine());
		*/
    }
}