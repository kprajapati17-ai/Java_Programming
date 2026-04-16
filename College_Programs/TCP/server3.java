/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.TCP;
import java.net.*;
import java.io.*;
public class server3 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3000);
        Socket s1 = ss.accept();
        MsgToDay(s1);
        s1.close();
    }
        static void MsgToDay(Socket s) throws Exception
        {
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os =s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            String str;
            int pos;
            

        String word[] = {"1","2","3","4","5","6","7"};
        String meaning[] = {"MON","TUE","WED","THUR","FRI","SAT","SUN"};    

        dos.writeUTF("Enter Number 1 To 7 : And Exit for 'end'");
        
        while(true)
        {
            pos =-1;
            
            str = dis.readUTF();
            System.out.println("Number Is :"+str);
            if(str.equals("end"))
            {
                dos.writeUTF("End program..");
                System.out.println("End program..");
                break;
            }
            for(int i=0;i<word.length;i++)
            {
                if(str.equals(word[i]))
                {
                    dos.writeUTF("DAY IS :"+meaning[i]);
                    pos =1;
                    break;
                }
            }

            
            if(pos==-1)
            {
                dos.writeUTF("Not found.."); 
            }
        }
        dis.close();
        dos.close();
        is.close();
        os.close();
        
    }
    
}
