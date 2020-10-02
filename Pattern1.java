import java.util.Scanner;
public class Pattern1
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,l,i,k=0,c=0,x,j;
       System.out.println("Enter the number of inputs:");
       n=sc.nextInt();
       x=n;
       l=(n*(n+1))/2;
       int arr[]=new int[l];
       System.out.println("Enter the numbers:");
       for(i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(i=n;i<l;i++)
       {
           for(j=x-1;j>0;j--)
           {
               arr[n]=arr[k]+arr[k+j];
               n++;
               if(j==l)
               {
                   k=k+2;
               }
               else
               {
                   k++;
               }
           }
               x--;
       }
           k=0;
           for(i=5;i>=l;i--)
           {
               for(j=1;j<=i;j++)
               {
                   System.out.println(arr[k]+" ");
                   k++;
               }
             System.out.println();
           }
    }
           
}