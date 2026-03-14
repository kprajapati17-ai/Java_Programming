//Display factorial of given no by user. 

package Assignment_1;

import java.util.*;
public class Prog_7 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter No:");
        int n= sc.nextInt();// take input from user
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
    
        System.out.println("factorial Is:"+fact);
        
      
        
       
    }
    
}
