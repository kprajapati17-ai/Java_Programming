/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.file;

import java.io.*;
import java.util.*;
//import java.io.IOException;
public class file2 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/f1.txt");
            
            Scanner sc = new Scanner(System.in);
            BufferedWriter br = new BufferedWriter(new FileWriter(f1));
            
            for(int i=1;i<=5;i++)
            {
                System.out.print("Enter "+i+" Number :");
                int n = sc.nextInt();
                br.write(String.valueOf(n));//br.write(Integer.toString(n));//br.write(n+" ");
                br.newLine();
            }
            br.close();
        } catch (Exception e) {
              System.out.println("error:"+e);
            
        }
    }
}
