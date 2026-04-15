/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_8;
import java.util.*;
import java.io.*;
public class Prog_8 {
    public static void main(String[] args) {
        try {
           File p1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/oddstr.txt");
           File p2 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/evenstr.txt");
            
           BufferedReader os = new BufferedReader(new FileReader(p1));
           BufferedReader es = new BufferedReader(new FileReader(p2));
           
           String line;
           System.out.println("odd Strings:");

           while((line = os.readLine())!=null)
           {
               System.out.println(line);               
           }
           
           System.out.println("even Strings:");

           while((line = es.readLine())!=null)
           {
               System.out.println(line);               
           }
           
           os.close();
           es.close();
        } catch (Exception e) {
                System.out.println("error: " + e);

        }
    }
    
}
