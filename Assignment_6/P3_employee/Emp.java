/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_6.P3_employee;

import java.util.*;

public class Emp {
    Scanner sc = new Scanner(System.in);
    String name,des;
    double b_salary;

    public void input()
    {
        System.out.println("Enter Employee Name:");
        String name = sc.next();
        
        System.out.println("Enter Employee Designation:");
        String des = sc.next();

        System.out.println("Enter Basic Salary:");
         b_salary = sc.nextDouble();
        
    }
    public void Display()
    {
        System.out.println("Employee Detail......");
        System.out.println("Employee Name"+name);
        System.out.println("Employee Designation"+des);
        System.out.println("Employee Basic Salary"+b_salary);             
    }  
    double dd,hh,pp,net_sal;
    public void cal()
    {
    
         dd = b_salary*0.10;
         hh = b_salary*0.20;
         pp = b_salary*0.15;
         
         net_sal =(b_salary+dd+hh)-pp;


        System.out.println("DA: " + dd);
        System.out.println("HRA:"+ hh);
        System.out.println("PF:"+ pp);
        System.out.println("Total Salary:"+net_sal);
    }
}