package recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        m2(5);
    }

    public static void m1(int n)
    {
        System.out.println(n);
        if(n==5) return;
        m1(++n);
    }

    public static void m2(int n)
    {
        if(n==6) return;
        m2(++n);
        System.out.println(n-1);
    }

}
