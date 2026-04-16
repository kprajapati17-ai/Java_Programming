/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.file;

import java.io.*;
import java.util.*;
//import java.io.IOException;
public class file3 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/f1.txt");
            
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String line;
            int total=0;
            while((line = br.readLine()) !=null)
                    {
                        total += line.length();
                        int n = Integer.parseInt(line);
                        if(n%2==0)
                        {
                            System.out.println(n);
                        }   
                    }
            System.out.println(total);
            br.close();
        } catch (Exception e) {
              System.out.println("error:"+e);
            
        }
    }
}
