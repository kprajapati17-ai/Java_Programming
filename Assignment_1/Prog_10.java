//Print Pascal triangle. 
package Assignment_1;

import java.util.*;
public class Prog_10 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter No:");
        int n= sc.nextInt();// take input from user
        int i,j,k,num;
    
          for(i=0;i<=n;i++)
        {
            num =1;
            for(k=1;k<=n-i;k++)
             {
                 System.out.print(" ");   
             }
             for(j=0;j<=i;j++)
             {
                 System.out.print(" "+num+" ");
                 num =num*(i-j)/(j+1);
                  
             }
              System.out.println();
        }
        
    
        
      
        
       
    }
    
}
