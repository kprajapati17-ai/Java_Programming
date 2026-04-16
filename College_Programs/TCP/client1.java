
package college.TCP;

import java.io.*;
import java.net.*;
import java.util.Scanner; 

public class client1 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",5000);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Name:");
            String str = sc.nextLine();
            dos.writeUTF(str);
            dos.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
