/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_2;

import java.util.Scanner;
public class Prog_8 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String:");
            String str = sc.nextLine().toLowerCase();
            
           char vow[] ={'a','i','o','u','e'};
           int count[] = new int[5];
           
           for(int i=0;i<str.length();i++)
           {
               char ch = str.charAt(i);
               for (int j = 0; j < 5; j++) {
        
                        if(ch==vow[j])
                        {
                            count[j]++;
                        }
               }                 
           }
          
           char v[][] = new char[5][];
            for (int i = 0; i < 5; i++) {
                v[i] = new char[count[i]];
                for (int j = 0; j < count[i]; j++) {
                    
                    v[i][j] = vow[i];
                }
                
            }
            
            System.out.println("VOWELS DISPLAY :");
            for (int i = 0; i < 5; i++) {
                
                System.out.print(vow[i]+":");
                for (int j = 0; j < v[i].length; j++) {
                    
                      System.out.print(v[i][j]);
                    
                }
              System.out.println();
                
            }
            
           System.out.println("VOWELS COUNT :");
            for (int i = 0; i < 5; i++) {
                
                System.out.println(vow[i]+":"+count[i]);
                
            }
        }   
}
