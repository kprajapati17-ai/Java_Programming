package Assignment3;

import java.util.Scanner;

public class PROG3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Strings: ");
        int n = sc.nextInt();
        sc.nextLine();   // clear buffer

        String[] arr = new String[n];
        String temp;

        System.out.println("Enter Strings:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLine();
        }

        // Sorting
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i].compareTo(arr[j]) > 0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Strings in Ascending Order:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
