package recursion;

public class Factorial {
    public static void main(String[] args) {
        int fact = fact(5);
        System.out.println(fact);
    }

    public static int fact(int n)
    {
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
