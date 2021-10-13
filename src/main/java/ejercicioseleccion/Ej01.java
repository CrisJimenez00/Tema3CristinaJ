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
public class Ej01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("escanear edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }
    
    //Resultados:
    //-Si metemos 10: No es mayor de edad
    //-Si metemos 18: Es mayor de edad
    //-Si metemos 67: Es mayor de edad

}
