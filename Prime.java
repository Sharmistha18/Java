import java.util.Scanner; 
public class Prime 
{  
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        int a, b, i, j,c; 
  
         
        System.out.println("Enter lower bound of the interval: "); 
        a = sc.nextInt(); 
  
         
        System.out.println("\nEnter upper bound of the interval: "); 
        b = sc.nextInt();  
  
       
        System.out.println("\nPrime numbers between a and b are"); 
  
        for (i = a; i <= b; i++)
        { 
            if (i == 1 || i == 0) 
                continue; 
  
            c = 1; 
  
            for (j = 2; j <= i / 2; ++j) 
            { 
                if (i % j == 0) 
                { 
                    c = 0; 
                    break; 
                } 
            }  
            if (c == 1) 
                System.out.println(i); 
        } 
    } 
} 
