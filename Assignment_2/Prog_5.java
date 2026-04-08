/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_2;

import java.util.Scanner;
public class Prog_5 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
           
            int arr[] = new int[10];
            System.out.print("Enter How Many Numbers:");
            int n = sc.nextInt();
            int num;
            for(int i=0;i<n;i++)
            {
                num= sc.nextInt();
                if(num>=0 && num<=100)
                {
                    arr[num/10]++;
                }
            }
            
            for(int i=0;i<10;i++)
            {
                int st = i*10;
                int ed = st+10;
                
                if(i==0)
                {
                    System.out.println("0-10 :"+arr[i]);
                }
                else
                {
                   System.out.println((st+1)+"-"+(ed)+":"+arr[i]);  
                }
            }
            
           
        }    
    
}
