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
public class EjB {

    public static void main(String[] args) {
        //Creamos el scanner
        Scanner teclado = new Scanner(System.in);

        //Pedimos los satos válidos para este ejercicio
        System.out.println("Introduzca un número de caracter");
        int numero = teclado.nextInt();

        if (numero >= 48 && numero <= 57) {
            System.out.println("Ha introducido un dígito");
        } else if (numero >= 65 && numero <= 90) {
            System.out.println("Ha introducido una letra mayúscula");
        } else if (numero >= 97 && numero <= 122) {
            System.out.println("Ha introducido una letra minúscula");
        }

    }

}
