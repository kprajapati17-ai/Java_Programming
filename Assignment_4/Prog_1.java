/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_4;

import java.util.*;

class Emp
{
    String name,des;
    double b_salary;

    Emp(String nam,String de,double bs) {      
        name=nam;
        des=de;
        b_salary=bs;     
    }
    
    void Display()
    {
        System.out.println("Employee Detail......");
        System.out.println("Employee Name"+name);
        System.out.println("Employee Designation"+des);
        System.out.println("Employee Basic Salary"+b_salary);             
    }    
}

    
class Salary extends Emp
{
    double da,hra,pf,net_sal;

    Salary(String nam,String de,double bs,double daa,double hraa,double pff) {
        super(nam, de, bs);
        da = daa;
        hra = hraa;
        pf = pff;
        
    }
    
    void cal()
    {
        double dd = super.b_salary*da;
        double hh = super.b_salary*hra;
        double pp = super.b_salary*pf;
         
        net_sal =(b_salary+dd+hh)-pp;
    }
    
     void  display(){
        super.Display();
        System.out.println("DA: " + (da * 100) + "%");
        System.out.println("HRA:"+ (hra * 100) + "%");
        System.out.println("PF:"+ (pf * 100) + "%");
        System.out.println("Total Salary:"+net_sal);
    }
}
public class Prog_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name = sc.next();
        
        System.out.println("Enter Employee Designation:");
        String des = sc.next();

        System.out.println("Enter Basic Salary:");
        double b_sal = sc.nextDouble();
        
        Salary s1 = new Salary(name,des,b_sal,0.10,0.20,0.12);
        s1.cal();
        s1.display();
    }
    
    
    
}
