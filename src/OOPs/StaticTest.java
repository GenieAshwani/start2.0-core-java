package OOPs;


class InstanceDemo{
    int a=10;
}
class StaticDemo{

    static int a=100;

}
public class StaticTest {

    public static void main(String[] args) {
        InstanceDemo obj1=new InstanceDemo();
        InstanceDemo obj2=new InstanceDemo();
        InstanceDemo obj3=obj1;
        obj3.a=100;
        System.out.println(obj1.a);
        System.out.println(obj2.a);

        System.out.println("--------------------------------------");
        StaticDemo o1=new StaticDemo();
        StaticDemo o2=new StaticDemo();


        StaticDemo.a=199;
        System.out.println(StaticDemo.a);


    }
}
