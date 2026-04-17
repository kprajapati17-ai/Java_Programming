/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package old_paper;

import java.net.*;
import java.io.*;
public class server1 {
    public static void main(String[] args)throws Exception {
       ServerSocket ss = new ServerSocket(1000);
       Socket s = ss.accept();
       MsgTo(s);
       s.close();
    }
    static void MsgTo(Socket s) throws Exception
    {
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            dos.writeUTF("ODD AND EVEN CHARACTER :\n");
            String str1,str2,even="",odd="";
            int len;
            while(true)
            {
                str1 = dis.readUTF();
                even="";
                odd="";
                 if(str1.equals("end"))
                    {
                        dos.writeUTF("End Program");
                        System.out.println("End Program");                         
                         break;
                    }
                len =str1.length();
                for (int i = 0; i <len ; i++) {
                    if(i%2==0)
                    {
                        even = even + str1.charAt(i);                        
                    }
                    else
                    {
                        odd = odd + str1.charAt(i);                        
                    }                          
                }
                str2 ="\n"+"Length:"+len+"\n "+"ODD STRING:"+odd+"\n "+"EVEN STRING:"+even+"\n";
                dos.writeUTF(str2); 
            }
            dis.close();
                        dos.close();
                        os.close(); 
                        is.close() ;
                         s.close(); 
           
    }
}
