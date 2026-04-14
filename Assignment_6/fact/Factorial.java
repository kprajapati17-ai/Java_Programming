/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_6.fact;

/**
 *
 * @author kaila
 */
public class Factorial {
    public void fact1(int a)
    {
        int f =1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.err.println("Factorial:"+f);
    }
}
