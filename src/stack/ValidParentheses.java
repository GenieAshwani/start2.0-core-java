package stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {


        boolean res = isValid("{()}");
        System.out.println(res);
    }

    public static boolean isValid(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return true;
                char top=stack.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='['))
                {
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }
}
