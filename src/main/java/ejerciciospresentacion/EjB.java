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
        char letra = teclado.next().charAt(0);

        if (letra >= 48 && letra <= 57) {
            System.out.println("Ha introducido un dígito");
        } else if (letra >= 65 && letra <= 90) {
            System.out.println("Ha introducido una letra mayúscula");
        } else if (letra >= 97 && letra <= 122) {
            System.out.println("Ha introducido una letra minúscula");
        } else {
            System.out.println("El dato introducido es erróneo");
        }

    }

}
