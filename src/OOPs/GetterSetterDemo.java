package OOPs;

class CarDemo {
    String baseEngine="K98923WT";
}

class BMW extends CarDemo
{
    String carName;
    String baseEngine="K98923WT+H2344";
    //syntax

    BMW(String carName)
    {
        this.carName=carName;
        System.out.println(carName);
        System.out.println("constructor called....");
    }

    public void m1(String model)
    {
        int a=10;
        System.out.println(model);
        System.out.println("child : "+this.baseEngine);
        System.out.println("parent : "+super.baseEngine);
    }

}
public class GetterSetterDemo {

    public static void main(String[] args) {
        BMW bmw=new BMW("BMW");
        System.out.println(bmw.carName);

        bmw.m1("2013");
    }
}
