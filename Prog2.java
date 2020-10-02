public class Prog2
{
    public static void main(String args[])
    {
        Base ob=new Base();
        ob.show();
        
        Derived1 ob1=new Derived1();
        ob1.show();
        
        Derived2 ob2=new Derived2();
        ob2.show();
        
        Derived3 ob3=new Derived3();
        ob3.show();
    }
}


class Base
{
   int x;
   Base()
   {
       x=5;
   }
   public void show()
   {
       System.out.println("Base class x is:"+x);
   }
}

class Derived1 extends Base
{
    Derived1()
    {
        super();
    }
     public void show()
   {
       System.out.println("1st Derived class x is:"+x);
   }
}


class Derived2 extends Base
{
    Derived2()
    {
        super();
    }
     public void show()
   {
       System.out.println("2nd Derived class x is:"+x);
   }
}


class Derived3 extends Base
{
    Derived3()
    {
        super();
    }
     public void show()
   {
       System.out.println("3rd Derived class x is:"+x);
   }
}