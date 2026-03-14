//Display given no. is palindrome or not. 

package Assignment_1;

import java.util.*;
public class Prog_9 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter No:");
        int n= sc.nextInt();// take input from user
        int rvs=n;
        int sum =0,n2;
        while (n!=0) { 
             n2= n%10;
             sum=sum*10+n2;
             n=n/10;           
        }
        
        if(sum==rvs)
        {
                System.out.println("palindrome");
        }
        else{
            System.out.println(" Not palindrome");
        }
        
    
        
      
        
       
    }
    
}
