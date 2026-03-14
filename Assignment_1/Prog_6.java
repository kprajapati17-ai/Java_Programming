//Program to convert Celsius to Fahrenheit. 

package Assignment_1;

import java.util.*;
public class Prog_6 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter Celsius:");
        float c= sc.nextFloat();// take input from user
   
        float f=(c*9/5)+32;
        System.out.println("Celsius Is:"+c);
        System.out.println("Fahrenheit Is:"+f);
        
      
        
       
    }
    
}
