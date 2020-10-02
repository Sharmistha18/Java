public class Prog1
{
   public static void main(String args[])
   {
       Employee ob1=new Employee("ABC",1234);
       ob1.display();
       
       Scientist ob2=new Scientist("xyz",4567,98,"15 years teaching experience in IIT");
       ob2.display();
       
       DScientist ob3=new DScientist("PQR",5678,65,"3 years teaching experience in NIT","Best Teacher");
       ob3.display();
   }
}
class Employee
{
    String name;
    int id;
    Employee(String n,int i)
    {
        name=n;
        id=i;
    }
    
    public void display()
    {
        System.out.println(" Base class:");
        System.out.println("Name is ="+name);
        System.out.println("Id is="+id);
    }
}

class Scientist extends Employee
{
    int no_of_publication;
    String experience;
    Scientist(String n,int i,int no,String e)
    {
        super(n,i);
       no_of_publication=no;
      experience=e;
    
    }
    public void display()
    {
        System.out.println("1st Derived class:");
        System.out.println("Name is ="+name);
        System.out.println("Id is="+id);
        System.out.println("No.of Publication:"+no_of_publication);
        System.out.println("Experience:"+experience);
    }
}

class DScientist extends Scientist
{
    String award;
    DScientist(String n,int i,int no,String e,String a)
    {
        super(n,i,no,e);
        award=a;
    }
    public void display()
    {
        System.out.println("2nd Derived class:");
        System.out.println("Name is ="+name);
        System.out.println("Id is="+id);
        System.out.println("No.of Publication:"+no_of_publication);
        System.out.println("Experience:"+experience);
        System.out.println("Award:"+award);
    }
}

