/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_8;

import java.io.*;
import java.util.*;
public class Prog_1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/f1.txt");
            Scanner sc = new Scanner(System.in);
            BufferedWriter br = new BufferedWriter(new FileWriter(f1,true));
            
            for(int i=1;i<=10;i++)
            {
                System.out.print("Enter Number:");
                int n = sc.nextInt();
                br.write(String.valueOf(n));
                br.newLine();
            }
            br.close();

        } catch (Exception e) {
                          System.err.println("error:"+e);
        }
        
    }
    
}
