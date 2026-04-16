/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.TCP;

import java.net.* ; 
import java.io.* ; 
public class server2 {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(4000);
        Socket s1 = ss.accept();
        MsgToUpper(s1);
        s1.close();
        }
        static void MsgToUpper(Socket s) throws Exception
        {
            InputStream is= s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            String str1,str2;
            
            dos.writeUTF("Send String Back In Upper case And type 'end' to exit");
            
            while(true)
            {
                str1=dis.readUTF();
                 if(str1.equals("end"))
                {
                    dos.writeUTF("End program...");
                    System.out.println("End program...") ; 
                    break;
                }
                str2=str1.toUpperCase();
                dos.writeUTF("Upper Case :"+str2);
              
            }
             dos.close(); dis.close() ; 
             os.close(); is.close() ;
             s.close();
        }
    
}
