public class Prog4
{
   public static void main(String args[])
   {
       Derived ob=new Derived();
   }
}

class Base1
{
  int x;
  Base1()
  {
     x=10;
     System.out.println("Base Constructor:x="+x);
  }
}

class Derived extends Base1
{
    Derived()
    {
        super();
        System.out.println("Derived Constructor:x="+x);
    }
}