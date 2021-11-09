/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorepaso;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int operando1 = 0, operando2 = 0;
        //Variable centinela
        boolean solicitarDatos = true;

        //Comienzo del programa
        System.out.println("Bienvenido al calculator");

        //Pedimos a los usuarios los datos correspondientes y controlamos excepciones
        System.out.println("Introduce dos operandos");
        do {
            do {
                try {
                    //Bloque candidato a lanzar la excepcion
                    //(Podemos hacer el try catch a cada uno, pero esto es para repaso simple)
                    System.out.println("Operando 1: ");
                    operando1 = teclado.nextInt();
                    System.out.println("Operando 2: ");
                    operando2 = teclado.nextInt();

                    //Para controlar que los datos están correctamente introducidos.
                    solicitarDatos = false;
                } catch (InputMismatchException ime) {

                    //Código para tratar el error
                    System.out.println("Se ha introducido texto en lugar de números"
                            + "\nVuelva a introducir los datos");
                    teclado.nextLine();
                }
            } while (solicitarDatos); // Bucle que controla la excepción
        } while (!((operando1 > -100 && operando1 < 100) && (operando2 > -100 && operando2 < 100)));
        //Mostrar menú de opciones(Solo se sale si el usuario lo pide)
        //Filtramos las entradas del usuario(controlamos excepciones)
        //Cuatro opciones: +,-,*,/
        //No sabes cuántos operandos exactos tiene

    }

}
