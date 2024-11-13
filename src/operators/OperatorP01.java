package operators;

public class OperatorP01 {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);//--->0
        System.out.println(b%a);//--->

        System.out.println("---------------------------------");
        int c=2;
        c++; //c=c+1;
        System.out.println(c);
        --c;
        System.out.println(c);
        //pre ---> ++c --c  pahle incre/dec then oper
        //post --> c++ c--; //pahle oper then incre/dec

        int d=5;
        int k= ++d + --d + d++ - --d + d++;
                //6 +  5   + 5 - 5 + 5
        System.out.println(k);

        int g=10;
        int res=g++ - g-- + ++g + ++g + --g + g-- + g++ + --g;
              //10 - 11 +   11 +   12 +  11 + 11 +  10 + 10 =
        //radhika - 63
        //adithya - 62
        //amit - 64
        System.out.println(res);

    }
}
