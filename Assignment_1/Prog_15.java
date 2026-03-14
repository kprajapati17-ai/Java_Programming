//15. Write a java program to display given no. is Armstrong no or not. 

package Assignment_1;

import java.util.*;
public class Prog_15 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter No:");
        int n= sc.nextInt();// take input from user
        int rvs=n;
        int tmp=n;
        int sum =0,n2,c=0;
        
        while (tmp!=0) {            
            c++;
            tmp=tmp/10;
        }
        
        while (n!=0) { 
             n2= n%10;
             sum=sum+(int)Math.pow(n2, c);
             n=n/10;           
        }
        
        if(sum==rvs)
        {
                System.out.println("Armstrong");
        }
        else{
            System.out.println(" Not Armstrong");
        }
        
    
        
      
        
       
    }
    
}
