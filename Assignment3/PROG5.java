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
public class PROG5 {
    
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter Strings: ");
        String s = sc.nextLine();
        //sc.nextLine();   // clear buffer
        int ucount = 0;
        int lcount = 0;
        int ccount = 0;
        int vcount = 0;
        int scount = 0;
        //System.out.print("Convert Strings: ");
        
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            
            if(ch >= 'A' && ch<='Z'){
            
                ucount++; 
            }
            else if(ch >= 'a' && ch<='z'){
            
                  lcount++; 
            }
            
            
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
            {
            
                  vcount++; 
            }
            else if(ch == ' '){
                scount++;
            }
            
            else{
                ccount++; 
            }
            
           
               // System.out.print(ch);

        }
          System.out.println("UPPERCASE COUNT :"+ucount);
           System.out.println("LOWERCASE COUNT :"+lcount);
              System.out.println("CONSONANTS COUNT :"+ccount);
               System.out.println("VOWELS COUNT :"+vcount);
                System.out.println("SPACE COUNT :"+scount);


    }
}
