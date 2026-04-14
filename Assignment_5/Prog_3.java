/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_5;
import java.util.*;

interface exam
{
    void t_fees();
    void r_fees();
    void dis();
}

interface fees
{

    void t_fees();
    void r_fees();
    void dis();
}

class student implements exam,fees
{
    Scanner sc = new Scanner(System.in);
    int efees,cfees,epfees,cpfees,crf,erf;
    void input()
    {
        System.out.print("Enter Total College Fees: ");
        cfees = sc.nextInt();

        System.out.print("Enter Paid College Fees: ");
        cpfees = sc.nextInt();

        System.out.print("Enter Total Exam Fees: ");
        efees = sc.nextInt();

        System.out.print("Enter Paid Exam Fees: ");
        epfees = sc.nextInt();
    }
    
    public void t_fees()
    {
            System.out.println("College total fees:"+cfees);
            System.out.println("exam total fees:"+efees);
    }
    
    public void r_fees()
    {
             crf = cfees-cpfees;
             erf = efees-epfees;
            System.out.println("College Remaining  fees:"+crf);
            System.out.println("exam Remaining  fees:"+erf);
    }
    public void dis()
    {
        if(crf==0 && erf==0)
        {
          System.out.println("Student is Eligible for Exam");
        } else {
            System.out.println("Student is NOT Eligible for Exam");
        }
    }
}
public class Prog_3 {
    public static void main(String args[])
    {
        student s = new student();
        s.input();
        s.t_fees();
        s.r_fees();
        s.dis();
        
    }    
}
