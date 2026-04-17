/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package old_paper;

import java.net.*;
import java.io.*;
import java.util.*;
public class client1 {
    public static void main(String[] args)throws Exception {
       Socket s = new Socket("localhost",1000);
       MsgTo(s);
       s.close();
    }
    static void MsgTo(Socket s) throws Exception
    {
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            Scanner sc = new Scanner(System.in);
            String str2=dis.readUTF();
            System.out.println(str2);
            String str1;

            while(true)
            {
                System.out.print("Enter String:");
                str1 = sc.nextLine();
                
                dos.writeUTF(str1);
               
                str2 = dis.readUTF();
                System.out.println(str2);

                if(str1.equals("end"))
                    {
                        System.out.println("End Program");              
                         break;
                    }               
            }
                        dis.close();
                        dos.close();
                        os.close(); 
                        is.close() ;
                         s.close();  
    }
}
