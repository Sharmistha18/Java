import java.util.Scanner;
public class BankAccount
{
    String name,address,accnum;
    double balance;
    BankAccount(String n,String a,String ac,double b)
    {
        name=n;
        address=a;
        accnum=ac;
        balance=b;
    }
    void deposit(double amt)
    {
   
       System.out.println("Enter the amount to be deposited:"+amt);
    }
    
    double withdraw(double am)
    {
        if(balance<2000.00)
        {
            System.out.println(" Low Balance:");
        }
        else
        {
         balance=balance-am;   
        }
        return(balance);
    }
    double withdraw(double am1,char c)
    {
        if(balance<2000.00)
        {
            System.out.println("Withdrawal not possible:");
        }
        else
        {
            balance=balance-am1;
        }
        return balance;
    }
    
    void display()
    {
        System.out.println("Name of the account holder:"+name);
        System.out.println("Address of the account holder:"+address);
        System.out.println("Balance of the account holder:"+balance);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn:");
        double x=sc.nextDouble();
        BankAccount ob1=new BankAccount("abc","kolkata","hdfc45678",50000.00);
        ob1.deposit(7000.00);
        ob1.display();
        ob1.withdraw(x);
        ob1.display();
        ob1.withdraw(x,'a');
        ob1.display();
    }
}