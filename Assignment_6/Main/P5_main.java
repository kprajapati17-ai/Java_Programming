/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_6.Main;

/**
 *
 * @author kaila
 */
import java.util.*;
import Assignment_6.P5_conversion.*;
public class P5_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalToBinary dtb = new DecimalToBinary();
        DecimalToOctal dtc = new DecimalToOctal();
        System.out.print("Enter Any Decimal Number:");
        int n = sc.nextInt();
        dtb.convert(n);
        dtc.convert(n);
    }
}
