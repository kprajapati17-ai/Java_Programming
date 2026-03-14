//Enter marks of five subject and display grade accordingly. 

package Assignment_1;

import java.util.*;
public class Prog_5 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter Gujarati Marks:");
        int sub1= sc.nextInt();// take input from user
        
         System.out.print("Enter English Marks:");
        int sub2= sc.nextInt();// take input from user
        
         System.out.print("Enter Math Marks:");
        int sub3= sc.nextInt();// take input from user
        
         System.out.print("Enter Science Marks:");
        int sub4= sc.nextInt();// take input from user
        
         System.out.print("Enter Hindi Marks:");
        int sub5= sc.nextInt();// take input from user
        
        int total = sub1+sub2+sub3+sub4+sub5;
        
        float avg = total/5;
        
        System.out.println("Total Marks Is:"+total);
        System.out.println("Avg Is:"+avg);
        
        if(avg>=90)
        {
                    System.out.println("A+");
        }
        else if (avg>=80) {
            System.out.println("A");
        }
        else if (avg>=65) {
            System.out.println("B");
        }
        else if (avg>=50) {
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
        
       
    }
    
}
