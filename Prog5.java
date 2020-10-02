public class Prog5
{
    public static void main(String args[])
    {
        Parent1 ob1=new Parent1();
          ob1.display();
          
        ChildOne ob2=new ChildOne();
          ob2.display();
          
        ChildTwo ob3=new ChildTwo();
          ob3.display();
    }
}

class Parent1
{
    int id;
    String name,address;
    
    Parent1()
    {
        id=23;
        name="ABC";
        address="KOLKATA";
    }
    public void display()
    {
        System.out.println(":PARENT CLASS:");
        System.out.println("The name in Parent is:"+name);
        System.out.println("The id in Parent is:"+id);
        System.out.println("The address in Parent is:"+address);
    }
}

class ChildOne extends Parent1
{
    int marks;
    int id;
    String name,address;
    
     ChildOne()
     {
         name=super.name;
         id=super.id;
         address =super.address;
         marks=90;
         
     }
     public void display()
     {
         System.out.println(":CHILD1 CLASS:");
         System.out.println("The name in child1 is:"+name);
         System.out.println("The id in child1 is:"+id);
         System.out.println("The address in child1 is:"+address);
         System.out.println("The marks in child1 is:"+marks);
     }
}

class ChildTwo extends Parent1
{
    String qualification;
    double salary;
    int id;
    String name,address; 
    
    ChildTwo()
     {
         
         name=super.name;
         id=super.id;
         address=super.address;
         qualification="Graduate";
         salary= 30000.00;
         
     }
     public void display()
     {
         System.out.println(":CHILD2 CLASS:");
         System.out.println("The name in child2 is:"+name);
         System.out.println("The id in child2 is:"+id);
         System.out.println("The address in child2 is:"+address);
         System.out.println("The qualification in child2 is:"+qualification);
         System.out.println("The salary in child2 is:"+salary);
     }
}