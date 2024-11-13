package OOPs;

class Demo{
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int sum(int a,int b,int c)
    {
        return a+b;
    }
    public float sum(int a,float b)
    {
        return a+b;
    }
}


public class OverLoadingDemo {

    public static void main(String[] args) {
        Demo demo=new Demo();
        int sum = demo.sum(10, 4);
        System.out.println(sum);

        int sum1 = demo.sum(10, 4,5);
        System.out.println(sum1);
    }
}
