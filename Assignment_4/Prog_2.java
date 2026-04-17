/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment_4;

/**
 *
 * @author 202523
 */
import java.util.Scanner;

class book{
    String bname,aname;
    int bid;
    boolean Avable=true;

    book(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book Name:");
        bname = sc.next();
        
        System.out.println("Enter author name:");
        aname = sc.next();

        System.out.println("Enter book id:");
        bid = sc.nextInt();
    }
    void display(){
        System.out.println(".............. book Information ..............");
        System.out.println("book Name:"+bname);
        System.out.println("author name:"+aname);
        System.out.println(" book id:"+bid);
        System.out.println("Availability: " + (Avable ? "Available" : "Issued"));

    }   
    
}

class Issues extends book{
     String mname,rdate;
     Scanner sc = new Scanner(System.in);
     Issues() {
         super();
         
        System.out.println("Enter mamber name:");
        mname = sc.next();
        
        System.out.println("Enter return date:");
        rdate = sc.next();
        Avable=false;
    }
    
       void displayI(){
        System.out.println(".............. book Information ..............");
        System.out.println("Member Name:"+mname);
        System.out.println("Return Date:"+rdate);
    }   
}
public class Prog_2 {
    public static void main(String[] args){
        Issues s1 = new Issues();
        s1.display();
        s1.displayI();
    }
}
