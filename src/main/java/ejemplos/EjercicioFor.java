/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class EjercicioFor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce hasta el número que desea la factorización");

        int numeroLimite = teclado.nextInt();
        long resultado = 1;

        for (int i = 1; i <= numeroLimite; i++) {
            if (i <= numeroLimite) {
                resultado = i * resultado;

                System.out.print(resultado + " - ");
            } else {
                System.out.println("Fin");
            }
        }
    }

}
