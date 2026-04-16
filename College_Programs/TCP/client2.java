/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.TCP;

import java.net.* ; 
import java.io.* ; 
import java.util.*;
public class client2 {
    public static void main(String[] args) throws Exception{
        Socket s1 = new Socket("localhost",4000);
        getMsgToUpper(s1);
        s1.close();
        }
        static void getMsgToUpper(Socket s) throws Exception
        {
            InputStream is= s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            Scanner sc = new Scanner(System.in);
            String str1,str2;
            
            str1=dis.readUTF();
            System.out.println(str1) ; 

            while(true)
            {
                System.out.print("Enter String:");
                str1 = sc.nextLine();
                dos.writeUTF(str1);
                str2 =dis.readUTF();
                System.out.println(str2) ; 

                if(str1.equals("end"))
                {
                    break;
                }
                
            }
             dos.close(); dis.close() ; 
             os.close(); is.close() ;
                          s.close();

        }
    
}
