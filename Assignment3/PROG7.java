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

public class PROG7 {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st Array Size :");
        int n1 = sc.nextInt();
        sc.nextLine();
        String[] arr1 = new String[n1];
        
         for(int i=0;i<n1;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr1[i] = sc.nextLine();
     
        } 
              
        System.out.print("Enter 2Ed Array Size :");
        int n2 = sc.nextInt();
                sc.nextLine();

        String[] arr2 = new String[n2];
        
         for(int i=0;i<n2;i++){
        
            System.out.print("Enter Value of "+(i)+" :");
            arr2[i] = sc.nextLine();
     
        }
         
         String com[] = new String[n1];
         int k =0;
          for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < n2; j++)
                {
                    if(arr1[i].equals(arr2[j]))
                    {
                            com[k] = arr1[i];
                            k++;
                            break;
                    }
                }
            }
          
          System.out.println("Common strings ");
          
          if(k==0){
                    System.out.println("Not Common strings Found ");

          }else{
           for(int i = 0; i < k; i++)
            {
                System.out.print(com[i]+" ");
            }
          }


    }
}
