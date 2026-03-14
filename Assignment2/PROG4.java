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
public class PROG4 {
    
    public static void main( String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size Of Array :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int[] ase = new int[n];
        for(int i=0;i<n;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr[i] = sc.nextInt();
     
        } 
        
        for(int i=0;i<n;i++){
        
                ase[i] = arr[i];
        } 
        
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                if(ase[i] > ase[j]){
                    
                    ase[i] = ase[i] + ase[j];
                    ase[j] = ase[i] - ase[j];
                    ase[i] = ase[i] - ase[j];
                }
            }
        
            
        }
        
          System.out.println("1st  Array:");
        for(int i=0;i<n;i++){
        
         System.out.println(arr[i]);
     
        }   
           System.out.println("Assending Array:");
        for(int i=0;i<n;i++){
        
         System.out.println(ase[i]);
     
        }  
    }
    
}
