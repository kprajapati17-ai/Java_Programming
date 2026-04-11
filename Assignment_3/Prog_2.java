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
public class Prog_2 {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("How many enter String :");
    int n = sc.nextInt();
    sc.nextLine();
    String str[] = new String[n];
        for (int i = 0; i < n; i++) {
                System.out.print(i+"Enter a String :");
                 str[i] = sc.nextLine();
        }

    
        for (int i = 0; i < n; i++) {
                boolean f =false;
            for (int j = 0; j < i; j++) {
                    if(str[i].equals(str[j]))
                    {
                        f=true;
                        break;
                    }
                   
                 
            } 
             if(!f)
                    {
                              System.out.println(str[i]+" ");  
                    }
        }

//        System.out.println(" Palindrom");
    }
    
}
