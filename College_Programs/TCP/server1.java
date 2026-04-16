
package college.TCP;

import java.io.*;
import java.net.*;
public class server1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str =(String)dis.readUTF();
            System.out.println("Name:"+str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
