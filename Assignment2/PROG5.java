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
public class PROG5 {
     public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int[] r = new int[10]; 
        System.out.print("Enter Number Of Element :");
        int n = sc.nextInt();
        System.out.print("Enter  Element :"); 
      for(int i=0;i<n;i++){
          
          int num = sc.nextInt();
          if(num>=0 && num<=100)
          {
              r[num/10]++;
          }
      }
        
     System.out.println("In range Statistics...");
         for(int i=0;i<10;i++){
         
             int s = i*10;
             int e = s +10;
             
             if(i == 0){
             
                   System.out.println("0-10 ="+r[i]);
             }else{
             
                   System.out.println((s+1)+ "-" +e+ "=" +r[i]);
             }
         }
        //System.out.println("91-100 ="+r[9]);

         
    }    
}
