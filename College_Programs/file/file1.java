/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.file;

import java.io.*;
//import java.io.IOException;
public class file1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/f1.txt");
            if(f1.createNewFile())
            {
                System.out.println("File Created:"+f1.getName());
            }
            else
            {
                  System.out.println("File Alredy created..");
            }
            System.out.println(f1.getAbsolutePath());
        } catch (Exception e) {
              System.out.println("error:"+e);
            
        }
    }
}
