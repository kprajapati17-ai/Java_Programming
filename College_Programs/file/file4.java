/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.file;

import java.io.*;
import java.util.*;
//import java.io.IOException;
public class file4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/f1.txt");
            File odd = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/odd.txt");
            File even = new File("C:/Users/kaila/Documents/NetBeansProjects/Java_Programming/src/college/file/even.txt");
            BufferedWriter beven = new BufferedWriter(new FileWriter(even));
            BufferedWriter bodd = new BufferedWriter(new FileWriter(odd));

            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String line;
            int total=0;
            while((line = br.readLine()) !=null)
                    {
                        int n = Integer.parseInt(line);
                        if(n%2==0)
                        {
                            beven.write(Integer.toString(n));
                            beven.newLine();
                        }  
                        else
                        {
                            bodd.write(String.valueOf(n));
                            bodd.newLine();    // ✔️ important

                        }    
                    }
            System.out.println("Success saperated");
            br.close();
 
            beven.close();   // ✔️ MUST
            bodd.close();  
        } catch (Exception e) {
              System.out.println("error:"+e);
            
        }
    }
}
