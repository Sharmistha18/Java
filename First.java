
public class First
{
    public int x;
    First(int a)
    {
        x=a;
    }
    public void show()
    {
        System.out.println("Instance variable is="+x);
    }
    public static void main(String args[])
    {
        First obj=new First(5);
        obj.show();
    }
    
    
}