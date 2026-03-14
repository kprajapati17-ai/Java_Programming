/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment3;

/**
 *
 * @author kaila
 */
import java.util.Scanner;
public class PROG2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter No Of String :");
        int n = sc.nextInt();
        sc.nextLine();
        
        String str[] = new String[n];
        System.out.println("Enter Strings :");
        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
        }
        
         System.out.println("After Duplicate Strings :");
        
           for(int i=0;i<n;i++){
           // str[i] = sc.nextLine();
                boolean f =false;
                        for(int j=0;j<i;j++){
                            
                                if(str[i].equals(str[j])){
                                    f = true;
                                    break;
                                } 
                        }
                  if(!f){
                           System.out.println(str[i]+" ");
                        }         
        }
    }
}
