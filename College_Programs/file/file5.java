/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.file;

import java.io.*;
import java.util.*;
//import java.io.IOException;
public class file5 {
    public static void main(String[] args) {
        try {
            File result = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/result.txt");
            File odd = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/odd.txt");
            File even = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/even.txt");
            BufferedReader beven = new BufferedReader(new FileReader(even));
            BufferedReader bodd = new BufferedReader(new FileReader(odd));

            BufferedWriter r = new BufferedWriter(new FileWriter(result));
            String line;
            r.write("Odd Numbers\n");
            while((line = bodd.readLine()) !=null)
                    {
                        int n = Integer.parseInt(line);
                        r.write(Integer.toString(n));
                            r.newLine();    
                    }
            
            r.write("\nEven  Numbers\n");
            while((line = beven.readLine()) !=null)
                    {
                        int n = Integer.parseInt(line);
               
                            r.write(Integer.toString(n));
                            r.newLine();
 
                    }
            System.out.println("Success");
            r.close();
 
            beven.close();   // ✔️ MUST
            bodd.close();  
        } catch (Exception e) {
              System.out.println("error:"+e);
            
        }
    }
}
