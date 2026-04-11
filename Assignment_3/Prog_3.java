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
public class Prog_3 {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("How many enter String :");
    int n = sc.nextInt();
    sc.nextLine();
    String str[] = new String[n];
    String temp;
    
        for (int i = 0; i < n; i++) {
                System.out.print(i+"Enter a String :");
                 str[i] = sc.nextLine();
        }

    
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                    if(str[i].compareTo(str[j]) > 0)
                    {
                       temp = str[i];
                       str[i] = str[j];
                       str[j] = temp;
                    }                             
            } 
        }
    System.out.println("Strings in Ascending Order:");
    for (int i = 0; i < n; i++) {
                System.out.println(str[i]);
            }
    }
    
}
