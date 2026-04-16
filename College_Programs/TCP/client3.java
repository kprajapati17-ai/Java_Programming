/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.TCP;
import java.net.*;
import java.io.*;
import java.util.*;
public class client3 {
    public static void main(String[] args) throws Exception {
        Socket s1 = new Socket("localhost",3000);
        MsgToDay(s1);
        s1.close();
    }
        static void MsgToDay(Socket s) throws Exception
        {
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os =s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            Scanner sc = new Scanner(System.in);
            String str1,str2;
            int pos;
          
            str2 = dis.readUTF();
            System.out.println(str2);
        while(true)
        {    
            System.out.println("Enter Number:");
            str1 =sc.nextLine();
            dos.writeUTF(str1);
            
            str2 = dis.readUTF();
            System.out.println(str2);

            if(str1.equals("end"))
            {
//                dos.writeUTF("End program..");
//                System.out.println("End program..");
                break;
            }
            
        }
        dis.close();
        dos.close();
        is.close();
        os.close();
        
    }
    
}
