package String;

import java.util.Arrays;

public class ReverseWord {

    public static void main(String[] args) {
        String s2="I Love  CFS";

        reverse(s2);

    }

    public static void reverse(String s)
    {
        StringBuilder res=new StringBuilder();
        int end=s.length();

        for(int i=s.length()-1 ;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                res.append(s.substring(i+1,end)).append(" ");
                end=i;
            }

        }
        if(end>0)
        {
            res.append(s.substring(0,end));
        }

        System.out.println(res);
    }
}
