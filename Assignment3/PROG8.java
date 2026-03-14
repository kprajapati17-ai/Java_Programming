/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment3;

/**
 *
 * @author kaila
 */
import java.util.Scanner;

public class PROG8 {
     public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st Array Size :");
        int n1 = sc.nextInt();
        sc.nextLine();
        String[] arr1 = new String[n1];
        
         for(int i=0;i<n1;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr1[i] = sc.nextLine();
     
        } 
         
         String s = arr1[0];
         int ml =arr1[0].length();
         
          for(int i=0;i<n1;i++){
        
              if(arr1[i].length() < s.length()){
                    s = arr1[i];
                    ml = arr1[i].length();
              }
     
        } 
           for(int i=0;i<n1;i++){
        
              if(arr1[i].length() == ml){
                             System.out.println("Sortest String are :"+arr1[i]);

              }
     
        }      
          
          
          System.out.println("Sortest String is"+s);

         
     }       
    
}
