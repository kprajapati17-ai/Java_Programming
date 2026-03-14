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
public class PROG1 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size Of Array :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
         int sum = 0;
         float avg = 0;
        for(int i=0;i<n;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        } 
        avg = (float)sum/n;
        System.out.print(" Array Avg is :"+avg);
    }
    
}
