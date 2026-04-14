/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_6.P5_conversion;

/**
 *
 * @author kaila
 */
public class DecimalToOctal {
     public void convert(int n) {
        int octal = 0, i = 1;

        while (n > 0) {
            int rem = n % 8;
            octal = octal + rem * i;
            i = i * 10;
            n = n / 8;
        }

        System.out.println("Octal = " + octal);
    }
}
