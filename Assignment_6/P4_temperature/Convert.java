/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_6.P4_temperature;

/**
 *
 * @author kaila
 */
public class Convert {
    double fa,ce;
    public void f_to_c(double f)
    {
        ce= (f - 32) * 5/9;
        System.out.println("Celsius:"+ce+"And "+"Fahrenheit:"+f);
    }
    
    public void c_to_f(double c)
    {
        fa = (c * 9/5) + 32;
        System.out.println("Celsius:"+c+"And "+"Fahrenheit:"+fa);
    }
}
