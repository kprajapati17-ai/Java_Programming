/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_8;

import java.io.*;
import java.util.*;
public class Prog_2 {
    public static void main(String[] args) {
        try {
            File s1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/vov.txt");
            File s2 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/Assignment_8/cons.txt");

            Scanner sc = new Scanner(System.in);
            BufferedWriter vo = new BufferedWriter(new FileWriter(s1));
            BufferedWriter co = new BufferedWriter(new FileWriter(s2));

            System.out.print("Enter String:");
            String str = sc.nextLine();
            str=str.toLowerCase();
            for(int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
                {
                    vo.write(ch);
                    vo.newLine();
                }
                else if(ch>='a' && ch<='z')
                {
                    co.write(ch);
                    co.newLine();  
                }
            }
            System.out.println("Success");
            vo.close();
            co.close();
            sc.close();

        } catch (Exception e) {
                          System.err.println("error:"+e);
        }
        
    }
    
}
