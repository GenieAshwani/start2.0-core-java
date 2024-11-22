package String;

import java.util.Arrays;

public class DuplcateDemo {

    public static void main(String[] args) {
        String s="abcdaz";
        findDuplicate(s);
    }

    public static void findDuplicate(String s)
    {
        int arr[]=new int[26]; // 0 0 0 0 -------- 0
        for(int i=0;i<s.length();i++)
        {
            int charValue=s.charAt(i);
            int arrayIndex=charValue-97;
            arr[arrayIndex]++; //arr[0]++;==1 ++ ==>2
            System.out.println(s.charAt(i)+"----------->"+"char Value ="+charValue+" Array index " +arrayIndex);
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>1)
            {
                char c= (char) (97+i);
                System.out.println("duplicate value = " +c);
            }
        }
    }
}
