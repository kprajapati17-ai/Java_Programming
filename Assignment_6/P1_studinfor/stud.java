/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_6.P1_studinfor;

//Enter marks of five subject and display grade accordingly. 



import java.util.*;

   
public class stud {
     String sname,cor;
     int rn,sem;
    public void input()
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter Student Name:");
         sname= sc.nextLine();// take input from user
        
         System.out.print("Enter Student Rollno:");
         rn= sc.nextInt();// take input from user
         sc.nextLine();
         System.out.print("Enter Student Course:");
         cor= sc.nextLine();// take input from user
        
         System.out.print("Enter  Sem:");
         sem= sc.nextInt();// take input from user
    
    }
    
    public void dis()
    {
        System.out.println("Name:"+sname);
        System.out.println("Sem:"+sem);
        System.out.println("Rollno:"+rn);
        System.out.println("course:"+cor);
   
    }
    
}


