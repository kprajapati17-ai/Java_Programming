/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_8;

import java.io.*;
import java.util.*;
public class Prog_4 {
    public static void main(String[] args) {
        try {
            File s1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/mystring.txt");

            Scanner sc = new Scanner(System.in);
            BufferedWriter ss = new BufferedWriter(new FileWriter(s1));                    

            
            for (int i = 0; i < 5; i++) {
                    System.out.print("Enter String:");
                    String str = sc.nextLine();
                    ss.write(str);
                    ss.newLine();
            }
            sc.close();
            ss.close();

            BufferedReader re = new BufferedReader(new FileReader(s1));
            String line;
            System.out.println("String Prints:");
            while ((line = re.readLine())!=null) {
                System.out.println(line);
          
            }
            
            System.out.println("Success");
            re.close();
        } catch (Exception e) {
                          System.err.println("error:"+e);
        }
        
    }
    
}
