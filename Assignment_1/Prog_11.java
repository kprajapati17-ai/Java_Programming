//1. Calculate an Electricity bill as following assumptions: 
// Up to 100 units = Rs.1 per unit 
// 101 to 200 units = Rs.1.50 per unit 
// 201 to 300 units = Rs.1.75 per unit 
// Above 300 = Rs.2 per unit 

package Assignment_1;

import java.util.*;
public class Prog_11 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter Bill Units:");
        int unit= sc.nextInt();// take input from user
              
        System.out.println("Bill Units Is:"+unit);
        float bill=0;
        if(unit>=0 && unit<=100)
        {
            bill = unit * 1;        
            System.out.println("Bill is:"+bill);
        }
        else if (unit>=101 && unit<=200) {
            bill = ((1.5f)*(unit-100) + 100);
            System.out.println("Bill is:"+bill);
        }
        else if (unit>=201 && unit<=300) {
            bill =((1.75f)*(unit-200)+(1.5f*100) + 100);
            System.out.println("Bill is:"+bill);
        }
        else if (unit>300) {
            bill = (2*(unit-300)+(1.75f*100)+(1.5f*100) + 100);
            System.out.println("Bill is:"+bill);
                
        }else{
            System.out.println("invalid");
        }
        
       
    }
    
}

