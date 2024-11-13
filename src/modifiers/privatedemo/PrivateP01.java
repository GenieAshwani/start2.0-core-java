package modifiers.privatedemo;


 class  PrivateClass
{
   private int a=10;
   public void m1()
   {
       System.out.println(a);
   }
}


public class PrivateP01 {

    public static void main(String[] args) {
        PrivateClass p=new PrivateClass();
        p.m1();///10
        //p.a; this will not work due to private access modifier
    }
}
