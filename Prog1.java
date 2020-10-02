public class Prog1
{
  public static void main(String ags[])
  {
      Parent obj=new Parent();
      Parent ref;
      ref=obj;
      ref.show();
      
      Child1 obj1=new Child1();
      Child1 ref1;
      ref1=obj1;
      ref1.show();
      
      Child2 obj2=new Child2();
      Child2 ref2;
      ref2=obj2;
      ref2.show();
      
      Child3 obj3=new Child3();
      Child3 ref3;
      ref3=obj3;
      ref3.show();
  }
}


class Parent
{
    int x;
    Parent()
    {
        x=10;
    }
    public void show()
    {
        System.out.println("The value of x is ="+x);
    }
}

class Child1 extends Parent
{
    int a;
    Child1()
    {
        super();
        a=5;
    }
    public void show()
    {
        System.out.println("The value of x is ="+x);
           System.out.println("The value of a ="+a);
    }
}

class Child2 extends Parent
{
    int b;
    Child2()
            {
               super();
               b=15;
            }
    public void show()
    {
        System.out.println("The value of x is ="+x);
        System.out.println("The value of b ="+b);
    }
}

class Child3 extends Parent
{
    int c;
    Child3()
            {
               super();
               c=20;
            }
    public void show()
    {
       System.out.println("The value of x is ="+x);
         System.out.println("The value of c ="+c);
    }
}


