/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_6.power;

/**
 *
 * @author kaila
 */
public class GetPower {
    public void pow1(int b,int e)
    {
        int a=1;
        for(int i=1;i<=e;i++)
        {
            a=a*b;
        }
        System.err.println("Power:"+a);
    }
}
