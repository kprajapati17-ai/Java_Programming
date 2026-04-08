/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_2;

import java.util.Scanner;
public class Prog_4 {
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
            
            int ass[] = new int[n];
            for(int i=0;i<n;i++)
            {
                ass[i]=arr[i];

            }
            
            for (int i = 0; i < n; i++) 
            {
                for (int j = i+1; j < n; j++) 
                {
                    if(ass[i] > ass[j])
                    {
                        ass[i] = ass[i] + ass[j];
                        ass[j] = ass[i] - ass[j];
                        ass[i] = ass[i] - ass[j];
                    }
                }
            }
            
              System.out.println("1st  Array:");
        for(int i=0;i<n;i++){
        
         System.out.println(arr[i]);
     
        }   
           System.out.println("Assending Array:");
        for(int i=0;i<n;i++){
        
         System.out.println(ass[i]);
     
        }  
          
        }    
    
}
