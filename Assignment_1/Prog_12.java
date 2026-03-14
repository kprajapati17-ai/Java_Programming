//2. Calculate telephone bill as following assumptions: 
// 3 month rent - 350 
// Monthly rent – 200 
// First 75 calls – free 
// Next 100 calls - .50 paisa /call 
// Next calls – Rs.1/call 


package Assignment_1;

import java.util.*;
public class Prog_12 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        System.out.print("Enter Calls:");
        int call= sc.nextInt();// take input from user
           
        System.out.print("Enter Month:");
        int month= sc.nextInt();// take input from user
        System.out.println("call Is:"+call);
        float  rent;
        if (month==3)
        {
            rent = 350;
        }
        else
        {
            rent=month*200;
        }
    
        if(call<=75)
        {
            System.out.println("Enjoy Free Calls");
        }
        else if (call<=175) {
            rent = rent + (0.5f)*(call-75);
        }
          else  {
            rent = rent + (0.5f)*(call-75)+ 1*(call-175);
        }
     
                System.out.println("Rent Is:"+rent);

       
    }
    
}

