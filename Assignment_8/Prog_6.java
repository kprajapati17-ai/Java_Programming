/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_8;

import java.io.*;
import java.util.*;
public class Prog_6 {
    public static void main(String[] args) {
        try {
            File p1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/ascending.txt");
            File p2 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/descending.txt");
            BufferedReader re1 = new BufferedReader(new FileReader(p1));    
            BufferedReader re2 = new BufferedReader(new FileReader(p2));

            String line;
            System.out.println("Assending");
            while((line=re1.readLine())!=null)
            {
                System.out.println(line);
            }
            
            System.out.println("Deasending");
            while((line=re2.readLine())!=null)
            {
                System.out.println(line);
            }
            System.out.println("Success");
            re1.close();
            re2.close();

        } catch (Exception e) {
                          System.err.println("error:"+e);
        }
        
    }
    
}
