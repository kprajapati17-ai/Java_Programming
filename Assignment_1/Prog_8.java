//Display power of given values from user. 

package Assignment_1;

import java.util.*;
public class Prog_8 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter No:");
        int n= sc.nextInt();// take input from user
        System.out.print("Enter Power:");
        int p= sc.nextInt();// take input from user
        
        int power=1;
        for(int i=1;i<=p;i++)
        {
            power*=n;
        }
    
        System.out.println("power Is:"+power);
        
      
        
       
    }
    
}
