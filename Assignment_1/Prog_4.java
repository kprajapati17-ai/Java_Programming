//4. Enter P,R,N from user and display simple Interest.

package Assignment_1;

import java.util.*;
public class Prog_4 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter P:");
        float p= sc.nextFloat();// take input from user
        
        System.out.print("Enter R:");
        float r= sc.nextFloat();// take input from user
        
        System.out.print("Enter N:");
        float n= sc.nextFloat();// take input from user
        float simple_Interest = (p*r*n)/100;
        System.out.println("simple Interest Is:"+simple_Interest);
        
       
    }
    
}
