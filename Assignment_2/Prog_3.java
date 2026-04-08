/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_2;

import java.util.Scanner;
public class Prog_3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter How Many Numbers:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter Number:");
                arr[i]= sc.nextInt();
            }
            
            int max = arr[0];
            int min = arr[0];
            
            for(int i=0;i<n;i++)
            {
                if(max<arr[i])
                {
                    max = arr[i];
                }
                
                if(min>arr[i])
                {
                    min = arr[i];
                }
            }
            System.out.println("Max Number:"+max);
            System.out.println("Min Number:"+min);

        }    
    
}
