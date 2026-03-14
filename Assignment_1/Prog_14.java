//14. Write a java program to check whether a year is a leap year or not. 
package Assignment_1;

import java.util.*;
public class Prog_14 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter Year:");
        int y= sc.nextInt();// take input from user
         
        if(y%4==0 && y%100!=0|| y%400==0)
        {
                   System.out.println("This Year Is Leap Year"); 
        }
        else
        {
            System.out.println("This Year Is Not Leap Year");  
        }
    }
    
}

