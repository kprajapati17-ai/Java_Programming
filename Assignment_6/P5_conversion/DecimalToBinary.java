/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_6.P5_conversion;

/**
 *
 * @author kaila
 */
public class DecimalToBinary {
      public void convert(int n) {
        int binary = 0, i = 1;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + rem * i;
            i = i * 10;
            n = n / 2;
        }

        System.out.println("Binary = " + binary);
    }
}
