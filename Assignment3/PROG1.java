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
public class PROG1 {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a String :");
    String s = sc.nextLine();
    
    int i=0;
    int j= s.length()-1;
    
    while(i < j){
        if(s.charAt(i) != s.charAt(j)){
        
                System.out.print("Not Palindrom");
                return;
        }
        i++;
        j--;
    }   
      System.out.print("Palindrom");
    }
    
}
