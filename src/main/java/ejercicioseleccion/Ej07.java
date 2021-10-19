/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioseleccion;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ej07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");

                System.out.println("Introduzca un lado: ");
                double ladoCuadrado = entrada.nextDouble();
                double resultadoCuadrado = Math.pow(ladoCuadrado, 2);

                System.out.printf("El cuadrado tiene un área de: %.2f cm2", resultadoCuadrado);

                break;
            case 2:
                
                System.out.println("Ha seleccionado calcular el área de un triángulo");

                System.out.println("Introduzca la medida de la base: ");
                double baseTriangulo = entrada.nextDouble();
                System.out.println("Introduzca la altura del triángulo");
                double alturaTriangulo = entrada.nextDouble();

                double resultadoTriangulo = (baseTriangulo * alturaTriangulo) / 2;

                System.out.printf("El triángulo tiene un área de: %.2f cm2", resultadoTriangulo);

                break;
            case 3:
                
                System.out.println("Ha seleccionado calcular el área de un círculo");

                System.out.println("Introduzca la medida del radio: ");
                double radioCirculo = entrada.nextDouble();
                double resultadoCirculo = Math.pow(radioCirculo, 2) * Math.PI;

                System.out.printf("El círculo tiene un área de: %.2f cm2", resultadoCirculo);

                break;

        }
    }

}
