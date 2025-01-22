package recursion;

import java.util.ArrayList;

public class GetSubSeq {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(findSubSeq(s));
    }
    public static ArrayList<String> findSubSeq(String s)
    {
        if(s.isEmpty())
        {
            ArrayList<String> al=new ArrayList<>();
            al.add("");
            return al;
        }
        char cc=s.charAt(0);
        String rem=s.substring(1);
        ArrayList<String> myres=new ArrayList<>();
        ArrayList<String> rec=findSubSeq(rem);
        for(int i=0;i<rec.size();i++)
        {
            myres.add(rec.get(i));
            myres.add(cc+rec.get(i));
        }

        return myres;
    }
}
