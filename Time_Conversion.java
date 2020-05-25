package Hacker_Rank_Problem_Solving;



public class Time_Conversion{
    static String timeConversion(String s) {
        String result="";
        int hour;

        String[] hr=s.split(":");
        if (hr[2].charAt(2)=='P'&&hr[2].charAt(3)=='M')
        {
            if(Integer.parseInt(hr[0])==12)
            {
                result=hr[0]+":"+hr[1]+":"+hr[2].charAt(0)+hr[2].charAt(1);
            }


            else{hour=Integer.parseInt(hr[0])+12;
                String hr1=String.valueOf(hour);
                result=hr1+":"+hr[1]+":"+hr[2].charAt(0)+hr[2].charAt(1);
            }
        }

        else if (hr[2].charAt(2)=='A'&&hr[2].charAt(3)=='M')
        {
            if (Integer.parseInt(hr[0])==12)
            { result="00:"+hr[1]+":"+hr[2].charAt(0)+hr[2].charAt(1); }

            else { result = hr[0]+":"+hr[1]+":"+hr[2].charAt(0)+hr[2].charAt(1); }

        }

        return result;
    }

    public static void main(String[] args)  {

        String s = "04:59:59AM";

        System.out.print(timeConversion(s));


    }
}
