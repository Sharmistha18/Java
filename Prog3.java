public class Prog3
{
  public static void main(String args[])
  {
      Parent ob=new Parent();
      
      Child ob1=new Child();
  }
}

class Parent
{
    int x;
    Parent()
    {
        x=7;
    }
    {
        System.out.println("Non-static block of Parent:x="+x);
    }
    static
    {
        System.out.println("Static block of Parent:");
    }
}

class Child extends Parent
{
    Child()
    {
        super();
    }
    {
        System.out.println("Non-static block of Child:x="+x);
    }
    static
    {
        System.out.println("Static block of Child:");
    }
}