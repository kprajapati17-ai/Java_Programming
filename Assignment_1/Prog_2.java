///Enter two values from user and display addition, subtrcation, multiplication and division. 
package Assignment_1;

import java.util.*;
public class Prog_2 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter 1st No:");
        int n1 = sc.nextInt();// take input from user
        
        System.out.print("Enter 1st No:");
        int n2 = sc.nextInt();// take input from user
        System.out.println("addition Is:"+(n1+n2));
        System.out.println("subtrcation Is:"+(n1-n2));
        System.out.println("multiplication Is:"+(n1*n2));
        System.out.println("division Is:"+(n1/n2));
    }
    
}
