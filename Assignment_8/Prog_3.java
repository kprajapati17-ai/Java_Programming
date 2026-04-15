/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_8;

import java.io.*;
import java.util.*;
public class Prog_3 {
    public static void main(String[] args) {
        try {
            File s1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/vov.txt");
            File s2 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/cons.txt");

            BufferedReader vo = new BufferedReader(new FileReader(s1));
            BufferedReader co = new BufferedReader(new FileReader(s2));

            System.out.println("\nvowel:\n");
            
            String line;
            
            while((line=vo.readLine()) != null)
            {
                    //char ch = line.charAt(0);
                    System.out.println(line);
        
            }
            
            System.out.println("\nconsonant:\n");
            
            
            while((line=co.readLine()) != null)
            {
                    //char ch = line.charAt(0);
                    System.out.println(line);
        
            }
            vo.close();
            co.close();

        } catch (Exception e) {
                          System.err.println("error:"+e);
        }
        
    }
    
}
