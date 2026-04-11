/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_3;

/**
 *
 * @author kaila
 */
import java.util.Scanner;
public class Prog_7 {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("How many enter String :");
    int n = sc.nextInt();
    sc.nextLine();
    String str1[] = new String[n];
        for (int i = 0; i < n; i++) {
                System.out.print(i+"Enter a1 String :");
                 str1[i] = sc.nextLine();
        }
       System.out.println();


    String str2[] = new String[n];
        for (int i = 0; i < n; i++) {
                System.out.print(i+"Enter a2 String :");
                 str2[i] = sc.nextLine();
        }
    
        String comm[] = new String[n];
        int k =0;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if(str1[i].equals(str2[j]))
                {
                    comm[k] = str1[j];
                    k++;
                    break;
                }
            }
            
        }
       System.out.println("Common strings ");
       System.out.println(k);
        if(k==0){
                    System.out.println("Not Common strings Found ");

          }else{
                for (int i = 0; i < k; i++) {
                        System.out.print(comm[i]+" ");
                }
          }
    }
    
}
