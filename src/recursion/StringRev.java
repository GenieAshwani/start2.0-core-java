package recursion;

public class StringRev {
    public static void main(String[] args) {
        String s="abcd";
        String res = reverseLoop(s);
        System.out.println(res);
        String recRes = reverseRec(s);
        System.out.println(recRes);
    }

    public static String reverseLoop(String s)
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            res=s.charAt(i)+res;
        }
        return res;
    }

    public static String reverseRec(String s)
    {
        if(s.isEmpty())
        {
            return s;
        }
        return reverseRec(s.substring(1))+s.charAt(0);
    }
}
