/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTRA;

/**
 *
 * @author kaila
 */
public class aar_e {
    public static void main(String args[]) 
        { 

                int a[][]=new int[5][]; int i,j,val;  val=5; 
                a[0]=new int[1]; a[1]=new int[2]; 
                a[2]=new int[3]; a[3]=new int[4]; 
                a[4]=new int[5];
                for(i=0;i<4;i++) 
                    { 

                            for(j=0;j<a[i].length;j++) 
                            {
                                a[i][j]=val++; 
                            } 
                    }
                
                for(i=0;i<5;i++) 
                        { 
                            for(j=0;j<a[i].length;j++) 
                            { 
                                System.out.print(a[i][j]+" ");
                            } 
                             System.out.println();
                        }
        } 
}
