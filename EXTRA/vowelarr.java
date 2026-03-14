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
class display 
{ 
    Scanner sc=new Scanner(System.in); 
    String s; 
    int v,i,j,k; 
    char c; 
     
    display() 
    { 
        System.out.print("Enter String:"); 
        s=sc.nextLine(); 
    } 
    void disp() 
    { 
        for(i=0;i<s.length();i++) 
        { 
            c=s.charAt(i); 
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
            { 
              v++; 
            } 
             
        } 
        char a[][]=new char[v][]; 
        int tmp=0; 
       /* for(i=0;i<s.length();i++) 
        { 
            c=s.charAt(i); 
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
            { 
                tmp++; 
                a[tmp-1]=new char[tmp]; 
                for(j=0;j<tmp;j++) 
                { 
                    a[tmp-1][j]=c; 
                    System.out.print(a[tmp-1][j]); 
                }
                System.out.println(); 
                 
            } 
        } 
        System.out.println(v); 
        
         for(i=0;i<s.length();i++) 
        { 
            c = s.charAt(i); 
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
            { 
                a[tmp] = new char[tmp+1]; 
                a[tmp][0] = c;   // store vowel
                System.out.println(c); // ✅ simple print
                tmp++; 
            } 
        } */
          for(i=0;i<s.length();i++) 
        { 
            c = s.charAt(i); 
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
            { 
                a[tmp] = new char[tmp+1]; 

                for(j=0;j<a[tmp].length;j++) 
                { 
                    if(j==0)
                        a[tmp][j] = c;   // vowel only once
                    else
                        a[tmp][j] = '^'; // rest dash

                    System.out.print(a[tmp][j]);
                }
                System.out.println();
                tmp++; 
            }
        } 
    } 
} 

public class vowelarr {
    
    public static void main(String[] args)  
    { 
        display d1=new display(); 
        d1.disp(); 
    } 
} 