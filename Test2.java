
public class Test2
{
  public int a;
  Test2()
  {
      a=0;
  }
  public void setdata(int x)
  {
      a=x;
  }
  public void putdata()
  {
      System.out.println("The value of instance variable is="+a);
  }
  
}
class Test3
{
 public static void main(String args[])
 {
    Test2 ob=new Test2();
    ob.setdata(5);
    ob.putdata();
     
 }
}