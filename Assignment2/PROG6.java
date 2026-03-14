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
public class PROG6 {
    public static void main( String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size Of Array :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
     
        int ec=0;
        int oc=0;
        
         for(int i=0;i<n;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr[i] = sc.nextInt();
     
        } 
          for(int i=0;i<n;i++){
        
          if(arr[i]%2 == 0){
              ec++;
          }
          else{
              oc++;
          }
     
        } 
        int[] even = new int[ec];
        int[] odd = new int[oc];
        
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
        
          if(arr[i]%2 == 0){
              even[e++] = arr[i];
          }
          else{
              odd[o++] = arr[i];
          }
     
        } 
        
        System.out.println("Even Number Array :");
        for(int i=0;i<e;i++)
        {
            System.out.println(even[i]);
        }
        
        System.out.println("Odd Number Array :");
        for(int i=0;i<o;i++)
        {
            System.out.println(odd[i]);
        }
    }
}
