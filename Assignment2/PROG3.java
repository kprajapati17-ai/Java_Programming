/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;

/**
 *
 * @author kaila
 */
import java.util.Scanner;

public class PROG3 {
      public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size Of Array :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
               for(int i=0;i<n;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr[i] = sc.nextInt();
     
        } 
        int max = arr[0];
        int min = arr[0];

        for(int i=1;i<n;i++){
        
            if(arr[i]>max){
                max = arr[i];
            }
            
            if(arr[i]<min){
                min = arr[i];
            }
     
        } 
         System.out.println("Max Value is :"+ max);
         System.out.println("Min Value is :"+ min);
      }
}
