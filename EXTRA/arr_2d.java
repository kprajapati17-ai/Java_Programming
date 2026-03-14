/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTRA;

/**
 *
 * @author kaila
 */
import java.util.Scanner; 
public class arr_2d {
   public static void main(String args[]) 
    { 
        int a[][]=new int[4][3]; 
         
        Scanner sc=new Scanner(System.in); 
        for(int i=0;i<4;i++) 
        { 
             for(int j=0;j<3;j++) 
            { 
                System.out.print("Enter value for a["+i+"]"+"["+j+"]"+" :" ); 
                a[i][j]=sc.nextInt(); 
            } 
           } 
        for(int i=0;i<4;i++) 
        { 
            for(int j=0;j<3;j++) 
            { 
                System.out.print(a[i][j]+"   "); 
            } 
            System.out.println(); 
        } 
    } 
    } 