/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrepeticion;

/**
 *
 * @author cristina
 */
public class Ej03 {

    public static void main(String[] args) {
        int x = 15;
        final int FINAL = 25;

        for (int i = 1; i <= FINAL; i++) {
            System.out.print(x);
            System.out.print(" - ");
            x = x * 2;
        }

    }

}
