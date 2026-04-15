/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_8;

import java.io.*;
import java.util.*;
public class Prog_5 {
    public static void main(String[] args) {
        try {
            File s1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/mystring.txt");
            File p1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/ascending.txt");
            File p2 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/descending.txt");
            BufferedWriter p11 =new BufferedWriter(new FileWriter(p1));
            BufferedWriter p22 =new BufferedWriter(new FileWriter(p2));
            BufferedReader re = new BufferedReader(new FileReader(s1));
            String line;
            String str[]= new String[100];
            int s=0;
            while ((line = re.readLine())!=null) {
                str[s++] = line;
            }          
            re.close();
            
            String temp;
            
            for (int i = 0; i < s; i++) {
                for (int j = i+1; j < s; j++) {
                    
                    if(str[i].compareTo(str[j]) > 0)
                    {
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                    
                }
            }
           // p11.write("Assending:\n");
            for (int i = 0; i < s; i++) {
                p11.write(str[i]);
                p11.newLine();
            }
            
            p11.close();
            //p22.write("Deasending:\n");
            for (int i = s-1; i >= 0; i--) {
                
                p22.write(str[i]);
                p22.newLine();
            }
            p22.close();
            System.out.println("Success");
            re.close();
        } catch (Exception e) {
                          System.err.println("error:"+e);
        }
        
    }
    
}
