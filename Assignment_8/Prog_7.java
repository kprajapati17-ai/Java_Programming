/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_8;

import java.io.*;
import java.util.*;
public class Prog_7 {
    public static void main(String[] args) {
        try {
            File s1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/mystring.txt");
            File p1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/oddstr.txt");
            File p2 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/evenstr.txt");
            BufferedWriter p11 =new BufferedWriter(new FileWriter(p1));
            BufferedWriter p22 =new BufferedWriter(new FileWriter(p2));
            BufferedReader re = new BufferedReader(new FileReader(s1));
            String line;
            
            while ((line = re.readLine())!=null) {
                 int l =line.length();
                 if (l%2==0) {
                    p22.write("length:"+l+" "+"name:"+line);
                    p22.newLine();
                  }
                 else{
                     p11.write("length:"+l+" "+"name:"+line);
                     p11.newLine();
                 }
                 
            }          
            re.close();         
            p22.close();
            p11.close();

            System.out.println("Success");
        } catch (Exception e) {
                          System.err.println("error:"+e);
        }
        
    }
    
}
