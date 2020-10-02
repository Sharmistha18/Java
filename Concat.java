public class Concat
{
    int a,b,s;
    Concat()
    {
        a=10;
        b=5;
    }
    public void add()
    {
      
        System.out.println("Addition="+(a+b));
    }
    public float add(int x,float y)
    {
        float f=(float)(x+y);
        System.out.println("Addition ="+f);
        return f;
    }
   public Concat add(Concat ob1,Concat ob2)
   {
       Concat ob3=new Concat();
        ob3.s=ob1.a+ob2.b;
        System.out.println("Addition="+ob3);
        return ob3;
   }
   
    public void add(String s1,String s2)
    {
        String s3=s1+s2;
        System.out.println("Addition="+s3);
    }
    

    
    public static void main(String args[])
    {
        Concat ob=new Concat();
        ob.add();
        ob.add(5,6.0f);
        ob.add("computer","physics");
        ob.add(11,5);
    }
}