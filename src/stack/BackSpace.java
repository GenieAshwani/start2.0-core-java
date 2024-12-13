package stack;

import java.util.Stack;

public class BackSpace {
    public static void main(String[] args) {
        String s1="ab#c";
        String t="ad#c";

        System.out.println(backspaceCompare(s1,t));
    }

    public static boolean backspaceCompare(String s, String t) {
        String s2=stackOper(s);
        String s3=stackOper(t);
        return s2.equals(s3);
    }

    private static String stackOper(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='#')
            {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(c);
            }
        }
        //complete stack
        StringBuilder res=new StringBuilder();
        for(char c:stack)
        {
            res.append(c);
        }
        return res.toString();
    }
}
