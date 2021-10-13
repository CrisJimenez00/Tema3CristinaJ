/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseleccion;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Ej05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.println("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");

            System.out.println("Introduzca un lado: ");
            double ladoCuadrado = entrada.nextDouble();
            double resultadoCuadrado = Math.pow(ladoCuadrado, 2);

            System.out.printf("El cuadrado tiene un área de: %.2f cm2", resultadoCuadrado);

        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triángulo");

                System.out.println("Introduzca la medida de la base: ");
                double baseTriangulo = entrada.nextDouble();
                System.out.println("Introduzca la altura del triángulo");
                double alturaTriangulo = entrada.nextDouble();

                double resultadoTriangulo = (baseTriangulo * alturaTriangulo) / 2;

                System.out.printf("El triángulo tiene un área de: %.2f cm2", resultadoTriangulo);

            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo");

                    System.out.println("Introduzca la medida del radio: ");
                    double radioCirculo = entrada.nextDouble();
                    double resultadoTriangulo = Math.pow(radioCirculo, 2) * Math.PI;

                    System.out.printf("El círculo tiene un área de: %.2f cm2", resultadoTriangulo);

                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }

        }
    }
}
