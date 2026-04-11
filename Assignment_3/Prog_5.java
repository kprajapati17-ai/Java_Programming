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
public class Prog_5 {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String :");
    String str = sc.nextLine();
    int l=0,u=0,v=0,c=0,s=0;
            System.out.println("Count: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch >='A' && ch<='Z')
            {
                u++;
            }
            else if(ch >='a' && ch<='z')
            {
                l++;
            }
            
            if(ch=='i' ||ch=='o' ||ch=='u' ||ch=='e' ||ch=='a'||ch=='I' ||ch=='O' ||ch=='U' ||ch=='E' ||ch=='A')
            {
                v++;
            }
           else if(ch ==' ')
            {
                s++;
            }
            else
            {
                c++;
            }
           
            System.out.print(ch);

        }
    System.out.println("\nUPPERCASE COUNT :"+u);
           System.out.println("LOWERCASE COUNT :"+l);
              System.out.println("CONSONANTS COUNT :"+c);
               System.out.println("VOWELS COUNT :"+v);
                System.out.println("SPACE COUNT :"+s);


    }
    
}
