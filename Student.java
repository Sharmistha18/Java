public class Student
{
    int roll;
    String name,stream,college;
    
   Student(int r,String n,String s,String c)
    {
        roll=r;
        name=n;
        stream=s;
        college=c;
    }
    public void show()
    {
        System.out.println("Roll of the student ="+roll);
        System.out.println("Name of the student is ="+name);
        System.out.println("Stream of the student is ="+stream);
        System.out.println("College of the student is ="+college);
    }

    public static void main(String args[])
    {
        Student ob=new Student(5,"abc","btech","TIU");
        ob.show();
        Student ob1=new Student(8,"xyz","ece","IIT");
        ob1.show();
    }
}   
