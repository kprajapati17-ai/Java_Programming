
package Assignment_1;

import java.util.*;
public class Prog_3 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // create Scanner object
       
       System.out.print("Enter 1st Pattern No:");
        int n1 = sc.nextInt();// take input from user
       
       for(int i=1;i<=n1;i++)
        {
             for(int j=1;j<=n1;j++)
            {               
                if(j <= n1-i)
                 {
                        System.out.print(" ");
                 }
                 else{
                        System.out.print("*");
                     }   
             }
              System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.print("Enter 2ed Pattern No:");
        int n2 = sc.nextInt();

        for(int i=0;i<=n2;i++)
        {
            for(int j=0;j<=n2+i-1;j++)
            {
                if(j < 2*i)
                    System.out.print(" ");
                else
                    System.out.print((n2 - j + i) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.print("Enter 1st Pattern No:");
        int n3= sc.nextInt();// take input from user
        
        for(int i=1;i<=n3;i++)
        {
             for(int j=1;j<=n3;j++)
             {
                 if(j <= n3-i)
                 {
                        System.out.print(" ");
                 }
                 else{
                        System.out.print(n3-i+1);
                     }   
             }
              System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();

    }
    
}
//Enter 1st Pattern No:4
//   *
//  **
// ***
//****
//
//
//
//Enter 2ed Pattern No:4
//4 3 2 1 
//  3 2 1 
//    2 1 
//      1 
//        
//
//
//
//Enter 1st Pattern No:4
//   4
//  33
// 222
//1111

