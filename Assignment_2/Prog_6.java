/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_2;

import java.util.Scanner;
public class Prog_6 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter How Many Numbers:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            int on=0,en=0;
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter Number:");
                arr[i]= sc.nextInt();
                if(arr[i]%2==0)
                {
                    en++;
                }
                else{
                    on++;
                }
            }
            
            int odd[] = new int[on];
            int even[] = new int[en];
            int e=0,o=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    even[e++]=arr[i];
                }
                else{
                    odd[o++]=arr[i];
                }

            }

            
        System.out.println("Even Numbers:");
        for(int i=0;i<en;i++){
        
         System.out.println(even[i]);
     
        }   
        System.out.println("Odd Numbers:");
        for(int i=0;i<on;i++){
        
         System.out.println(odd[i]);
     
        }  
          
        }    
    
}
