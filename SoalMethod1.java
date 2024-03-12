/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalmethod1;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class SoalMethod1 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int n = angka.nextInt();
        
        tampilkanAngka(n);
    }
    
     public static void tampilkanAngka(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
