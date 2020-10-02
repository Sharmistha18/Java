import java.util.*;
public class Students1
{
   
        String sub[]=new String[6];
        int internal[]=new int[6];
        int theory[]=new int[6];
        
        void getdata()
    {
        int i;
         Scanner sc=new Scanner(System.in);
        for(i=0;i<6;i++)
        {
            System.out.println("Enter the subject:");
            sub[i]=sc.next();
            System.out.println("Enter the internal marks :");
            internal[i]=sc.nextInt();
            System.out.println("Enter the theory marks :");
            theory[i]=sc.nextInt();        
        }
        
        
    }
    void show()
    {
        int i;
        for(i=0;i<6;i++)
        {
            System.out.println("Subject:"+sub[i]);
            System.out.println("Internal marks:"+internal[i]);
            System.out.println("Theory marks:"+theory[i]);
            System.out.println("Grandtotal:"+(internal[i]+theory[i]));
        }
       
    }
    
    
    
    
    public static void main(String args[])
    {
       
       
       Students1 std1=new Students1();
       System.out.println("Enter the data for 1st student:");
       std1.getdata();
       System.out.println("Information for 1st stud:");
       std1.show();
       Students1 std2=new Students1();
       System.out.println("Enter the data for 2nd student:");
       std2.getdata();
       System.out.println("Information for 2nd stud:");
      std2.show();
       
    }
 }