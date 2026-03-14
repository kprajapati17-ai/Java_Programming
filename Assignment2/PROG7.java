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
public class PROG7 {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st Array :");
        int n1 = sc.nextInt();
        
        int[] arr1 = new int[n1];
        
         for(int i=0;i<n1;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr1[i] = sc.nextInt();
     
        } 
              
        System.out.print("Enter 2Ed Array :");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        
         for(int i=0;i<n2;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr2[i] = sc.nextInt();
     
        }
         
         int max = (n1 > n2) ? n1 : n2;
         
         int diff[] = new int[max];
         for(int i=0;i<max;i++){
        
            if(i < n1 && i < n2){
                diff[i] = arr1[i] - arr2[i];
            }
            else if(i < n1){
                diff[i] = arr1[i];
                
            }
            else{
                diff[i] = -arr2[i];
            }
     
        }
           System.out.println("Diffrence :");
            for(int i=0;i<max;i++){
        
            System.out.println(diff[i]);

     
        }
         

    }     
}
