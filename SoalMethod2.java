/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalmethod2;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class SoalMethod2 {

    public static void main(String[] args) {
       Scanner kubus = new Scanner(System.in);

        System.out.print("Sisi 1: ");
        double sisi1 = kubus.nextDouble();
        System.out.print("Sisi 2: ");
        double sisi2 = kubus.nextDouble();
        System.out.print("Sisi 3: ");
        double sisi3 = kubus.nextDouble();

        periksaKubus(sisi1, sisi2, sisi3);
    }
    
     public static void periksaKubus(double sisi1, double sisi2, double sisi3) {
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
