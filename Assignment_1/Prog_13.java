//Write all prime numbers between 1 to n nos.  
package Assignment_1;

import java.util.*;
public class Prog_13 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter No:");
        int n= sc.nextInt();// take input from user
        int i,j;
    
          for(i=2;i<=n;i++)
        {    
            int c=0;
             for(j=1;j<=i;j++)
             {
                 if(i%j==0)
                 {
                    c++;
                 }                                                  
             }
             if(c==2)
                 {
                     System.out.print(" "+i+" ");
                 }
        }
        
    
        
      
        
       
    }
    
}

