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

public class PROG6 {
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Strings: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter 2ed Strings: ");
        String s2 = sc.nextLine();
        
        if(s1.length() != s2.length()){
                    System.out.println("Strings are not anagram ");
        }
        else{
        int c =0;
        
         for(int i=0;i<s1.length();i++){
             char ch = s1.charAt(i);
             c =0;
             for(int j =0; j <s1.length() ; j++)
            {
                if(ch == s1.charAt(j)){
                    c++;
                }
                 if(ch == s2.charAt(j)){
                    c--;
                }
            }
             if(c!=0){
                 System.out.println("Strings are not anagram ");
             }
         }
           System.out.println("Strings are anagram ");
           sc.close();
        }
    }    
}
