package recursion;

import java.util.ArrayList;
import java.util.List;

public class Pemutation {
    public static void main(String[] args) {

        String s="abc";
        List<String> res=new ArrayList<>();
        findPer(s,"",res);
        System.out.println(res);
    }

    public static void findPer(String s,String base,List<String> res)
    {
        if(s.isEmpty())
        {
           res.add(base);
           return;
        }
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String rem=s.substring(0,i)+s.substring(i+1);
            findPer(rem,base+ch,res);
        }
    }
}
