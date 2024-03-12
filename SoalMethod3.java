/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalmethod3;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class SoalMethod3 {

    public static void main(String[] args) {
       Scanner segitiga = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi a: ");
        int a = segitiga.nextInt();

        System.out.print("Masukkan panjang sisi b: ");
        int b = segitiga.nextInt();

        System.out.print("Masukkan panjang sisi c: ");
        int c = segitiga.nextInt();
        
        periksaSegitiga(a,b,c);
        
    }
    
    public static void periksaSegitiga(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            System.out.println("Segitiga siku-siku");
        } else if (a * a + b * b > c * c) {
            System.out.println("Segitiga lancip");
        } else {
            System.out.println("Segitiga tumpul");
        }
    }
}
