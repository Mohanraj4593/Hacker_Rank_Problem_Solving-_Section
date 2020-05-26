package Hacker_Rank_Problem_Solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Designer_PDF_Viewer {

    public static int designerPdfViewer(int[] h,String word)
    {
        Map<Character,Integer> map=new HashMap<>();
        map.put('a',h[0]);  map.put('b',h[1]);  map.put('c',h[2]);
        map.put('d',h[3]);  map.put('e',h[4]);  map.put('f',h[5]);
        map.put('g',h[6]);  map.put('h',h[7]);  map.put('i',h[8]);
        map.put('j',h[9]);  map.put('k',h[10]); map.put('l',h[11]);
        map.put('m',h[12]); map.put('n',h[13]); map.put('o',h[14]);
        map.put('p',h[15]); map.put('q',h[16]); map.put('r',h[17]);
        map.put('s',h[18]); map.put('t',h[19]); map.put('u',h[20]);
        map.put('v',h[21]); map.put('w',h[22]); map.put('x',h[23]);
        map.put('y',h[24]); map.put('z',h[25]);

        char[] sw=word.toCharArray();
        int[] values=new int[word.length()];
        int i=0;
        for (char c:sw){
            values[i++]=map.get(c);
             System.out.println("The Value Of Character "+c+" In Lib is "+map.get(c));
             System.out.println("-----------------------------------------------");
        }

        Arrays.sort(values);
        int max=values[values.length-1];



        return (max*values.length);

    }

    public static void main(String[] args) {

    int[] h={1 ,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5 ,5 ,5 ,5 ,5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    String word="abc";

    System.out.println("Area of word is: "+designerPdfViewer(h,word));

    }
}
