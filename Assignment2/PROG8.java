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
public class PROG8 {
    
     public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String :");
        String s = sc.nextLine().toLowerCase();
       
        char vow[] ={'a','i','o','u','e'};
        int count[] = new int[5];
         for(int i=0;i<s.length();i++){
        
           char ch = s.charAt(i);
           
            for(int j=0;j<5;j++){
                    if(ch == vow[j]){
                        count[j]++;
                    }
             
            }
     
        } 
         
         char v[][] = new char[5][];
         for(int i=0;i<5;i++){
             
             v[i] = new char[count[i]];
              for(int j=0;j<count[i];j++){
                  v[i][j] = vow[i];
                  
              }
         
         }
         System.out.println("VOWELS DISPLAY :");
          for(int i=0;i<5;i++){
             
              System.out.print(vow[i]+" :");
            
              for(int j=0;j<v[i].length;j++){
                 
                    System.out.print( v[i][j] +" ");
              }
               System.out.println();
         
         }
          
           System.out.println("VOWELS COUNTS:");
           for(int i=0;i<5;i++){
             
              System.out.print(vow[i]+" :"+count[i]);
            
             // for(int j=0;j<v[i].length;j++){
                 
                  //  System.out.print(count[i]+" ");
             // }
               System.out.println();
         
         }
         
         
     }
}
