/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_5;

import java.util.*;
class add implements Mymath
{
    int c;
    public void calculate(int a,int b)
    {
        c= a+b;
    }
    public void display()
    {
            System.out.println("Addition is"+c);
    }
}

class sub implements Mymath
{
    int c;
    public void calculate(int a,int b)
    {
        c= a-b;
    }
    public void display()
    {
            System.out.println("Subtraction is"+c);
    }
}

class mul implements Mymath
{
    int c;
    public void calculate(int a,int b)
    {
        c= a*b;
    }
    public void display()
    {
            System.out.println("Multiplication is"+c);
    }
}

class div implements Mymath
{
    int c;
    public void calculate(int a,int b)
    {
        c= a/b;
    }
    public void display()
    {
            System.out.println("Divison is"+c);
    }
}
public class P1_calculater {
    
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st N:");
        int a=sc.nextInt();
        
        System.out.print("Enter 2ed N:");
        int b=sc.nextInt();
        
        add a1 = new add();
        a1.calculate(a, b);
        a1.display();
         
        mul m1 = new mul();
        m1.calculate(a, b);
        m1.display();
                
        div d1 = new div();
        d1.calculate(a, b);
        d1.display();
                
        sub s1 = new sub();
        s1.calculate(a, b);
        s1.display();
                
    }
}
