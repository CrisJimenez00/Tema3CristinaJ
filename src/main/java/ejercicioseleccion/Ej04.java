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
public class Ej04 {

    public static void main(String[] args) {

        //Pedimos datos
        System.out.println("Introduce edad:");
        Scanner teclado = new Scanner(System.in);

        int edad = teclado.nextInt();

        //Hacemos que parezca por pantalla un mensaje dependiendo de la edad
        String texto = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad";
        System.out.println(texto);

    }

}
