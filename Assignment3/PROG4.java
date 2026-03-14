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
public class PROG4 {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Strings: ");
        String s = sc.nextLine();
        //sc.nextLine();   // clear buffer
        
        System.out.print("Convert Strings: ");
        
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            if(ch >= 'A' && ch<='Z'){
            
                ch =(char)(ch+32); 
            }
            else if(ch >= 'a' && ch<='z'){
            
                 ch =(char)(ch-32);
            }
            
                System.out.print(ch);

        }

    }
    
}
