/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrepeticion;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.println("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        do {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        } while (x <= n);
    }

}