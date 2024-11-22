package String;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        String s="Ashwani";
        String s1="Ashwani";
        System.out.println(s.equals(s1));

        String s2="I Love CFS";
        String[] arr = s2.split(" ");
        System.out.println(Arrays.toString(arr));

        String s4 = s2.substring(6);
        System.out.println(s4);
        System.out.println("Lenght of string ="+s2.length());
        String s5 = s2.substring(7, s2.length());
        System.out.println(s5);

    }
}
