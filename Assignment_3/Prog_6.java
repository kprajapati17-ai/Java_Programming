/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_3;

/**
 *
 * @author kaila
 */
import java.util.Scanner;
public class Prog_6 {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st String :");
    String str1 = sc.nextLine();
    System.out.print("Enter 2ed String :");
    String str2 = sc.nextLine();
    
    if(str1.length()!=str2.length())
    {
            System.out.print("Strings are Not Anagram:");
            return;

    }
    int c =0;
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
  
            for (int j = 0; j < str2.length(); j++) {    
                 if(ch1 == str1.charAt(j))
                 {
                     c++;
                 }
                 if(ch1 == str2.charAt(j))
                 {
                     c--;
                 }
                 
            }
             if(c!=0){
                 System.out.println("Strings are not anagram ");
             }
        }
         System.out.println("Strings are anagram ");
    }
    
}
