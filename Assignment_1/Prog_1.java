//Write a java program to display your Address. 
package Assignment_1;

import java.util.*;
public class Prog_1 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter Your Address:");
        String address = sc.nextLine();// take input from user
        System.out.print("Your Address Is:"+address);
    }
    
}
