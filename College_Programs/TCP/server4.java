/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.TCP;
import java.net.*;
import java.io.*;
public class server4 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1000);
        Socket s1 = ss.accept();
        CountV_C(s1);
        s1.close();
    }
        static void CountV_C(Socket s) throws Exception
        {
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os =s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            String str1,str2,s1,s2;
            int v=0,c=0;
            
        dos.writeUTF("COUNT VOWEL AND CONSANAT AND EXIT FOR 'end'");
        
        while(true)
        {            
            v=0;
            c=0;
            str1 = dis.readUTF();
            str1 = str1.toLowerCase();
            if(str1.equals("end"))
            {
                dos.writeUTF("End program..");
                System.out.println("End program..");
                break;
            }
            
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
                {
                        v++;
                }
                else
                {
                        c++;
                }
            }
            s1 = Integer.toString(c);
            s2 = Integer.toString(v);
            str2 ="\nvovel char :"+s2+" "+"const char :"+s1;
            dos.writeUTF(str2);
            System.out.println(str2);
            
            
         
        }
        dis.close();
        dos.close();
        is.close();
        os.close();
        
    }
    
}
