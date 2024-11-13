package modifiers.ProtectedDemoDiff;

import modifiers.ProtectedDemo.ProtectedClass;


class ProtectedP02 extends ProtectedClass
 {
    public void m2()
    {
       System.out.println(a);
    }
}

public class Driver{
 public static void main(String[] args) {
  ProtectedP02 p02=new ProtectedP02();
  p02.m2();

 }
}
