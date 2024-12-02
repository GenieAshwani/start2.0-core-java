package pattern;

public class PatternP01 {
    public static void main(String[] args) {

            pattern01();
        System.out.println("----------------------");
            pattern02();
        System.out.println("----------------------");
        pattern03();
        System.out.println("----------------------");
        pattern04();
    }

    public static void pattern01()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void pattern02()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern03()
    {
        int c=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c++ +" ");
            }
            System.out.println();
        }

    }
    public static void pattern04()
    {

        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=5-i;j++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=(2*i-1);k++)
           {
               System.out.print("*");
           }
            System.out.println();
        }

    }
}
