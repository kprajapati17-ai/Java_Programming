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
public class Prog_4 {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String :");
    String str = sc.nextLine();
            System.out.print("Convert Strings UPPER To LOWER And Lower To Upper: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch >='A' && ch<='Z')
            {
                ch = (char)(ch+32);
            }
            else if(ch >='a' && ch<='z')
            {
                ch = (char)(ch-32);
            }
            System.out.print(ch);

        }
   
    }
    
}
