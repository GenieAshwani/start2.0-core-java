package OOPs;



//encapsulation
class SharmaJi
{
    String plot="200Gaj";

    public String prop()
    {
        return plot;
    }
}


class SharmaJiKaBeta extends SharmaJi
{
    @Override
    public String prop() {
        return "Cafe";
    }
}


public class InheritanceP01 {

    public static void main(String[] args) {
       SharmaJi sharmaJi=new SharmaJi();
        String prop = sharmaJi.prop();
        System.out.println(prop);

        System.out.println(sharmaJi.plot); //because plot is not private

        SharmaJiKaBeta sharmaJiKaBeta=new SharmaJiKaBeta();
        String propChild = sharmaJiKaBeta.prop();
        System.out.println(propChild);

        System.out.println("-------------------------");
        SharmaJi sharmaJi1 = new SharmaJiKaBeta();
        String prop1 = sharmaJi1.prop();
        System.out.println(prop1);

        //SharmaJiKaBeta sharmaJiKaBeta1=new SharmaJi();
    }
}
