/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospresentacion;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class EjA {

    public static void main(String[] args) {
        //Creamos el scanner
        Scanner teclado = new Scanner(System.in);

        //Pedimos los satos válidos para este ejercicio
        System.out.println("Introduzca un número");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es negativo");
        }

    }

}
