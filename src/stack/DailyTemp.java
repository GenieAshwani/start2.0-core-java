package stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp{

    public static void main(String[] args) {
        int temp[]={73,74,75,71,69,72,76,73};
        int[] temp1 = findTemp(temp);
        System.out.println(Arrays.toString(temp1));

    }

    public static int[] findTemp(int[] temp)
    {
        Stack<Integer> stack=new Stack<>();
        int res[]=new int[temp.length];
        for(int i=temp.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && temp[i]>=temp[stack.peek()] )
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i]=0;
            }
            else {
                res[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return res;
    }
}
