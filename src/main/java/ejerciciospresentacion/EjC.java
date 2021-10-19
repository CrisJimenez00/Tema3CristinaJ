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
public class EjC {

    public static void main(String[] args) {
        //Creamos el scanner
        Scanner teclado = new Scanner(System.in);

        //Pedimos los satos válidos para este ejercicio
        System.out.println("Introduzca un número del 1 al 10");
        int numero = teclado.nextInt();

        //Creo un if para asegurarme de que los datos son correctos los introducidos
        if (numero <= 10 && numero >= 1) {

            //generamos el swtich para poner un mensaje en cada caso
            switch (numero) {
                case 1:
                    System.out.println("El número en romano se puede leer como I");
                    break;
                case 2:
                    System.out.println("El número en romano se puede leer como II");
                    break;
                case 3:
                    System.out.println("El número en romano se puede leer como III");
                    break;
                case 4:
                    System.out.println("El número en romano se puede leer como IV");
                    break;
                case 5:
                    System.out.println("El número en romano se puede leer como V");
                    break;
                case 6:
                    System.out.println("El número en romano se puede leer como VI");
                    break;
                case 7:
                    System.out.println("El número en romano se puede leer como VII");
                    break;
                case 8:
                    System.out.println("El número en romano se puede leer como VIII");
                    break;
                case 9:
                    System.out.println("El número en romano se puede leer como IX");
                    break;
                case 10:
                    System.out.println("El número en romano se puede leer como X");
                    break;

            }
        } else {
            System.out.println("Ha introducido un dato erróneo");
        }
    }

}
