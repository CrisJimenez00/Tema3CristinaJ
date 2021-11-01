/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrandoms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class NumerosPrimos {

    public static void main(String[] args) {

        //Declaramos e inicializamos el objeto Scanner
        Scanner teclado = new Scanner(System.in);
        Random numeroRandom = new Random();

        //Declaramos variables 
        int opcion;
        boolean esPrimo = false;

        do {
            System.out.println("Bienvenido al programa de detector de números primos"
                    + "\n1.Introduces el número y te decimos si es primo o no"
                    + "\n2.Te damos un número primo de forma aleatoria"
                    + "\n3.Salir");
            opcion = teclado.nextInt();

            //Switch que controla las opciones
            switch (opcion) {

                case 1:

                    System.out.println("Ha elegido que le digamos si el "
                            + "número que nos diga es primo o no"
                            + "\nIntroduzca un número entre 2 y 600_000_000");
                    long numeroUsuario = teclado.nextInt();

                    //Para que el número esté dentro del rango correcto
                    if (numeroUsuario >= 2 && numeroUsuario <= 600_000_000) {

                        //Para separar entre números par o impar
                        if (numeroUsuario % 2 != 0 || numeroUsuario == 2) {

                            //
                            for (int i = 3; i <= numeroUsuario / 2; i ++) {

                                //La condición hace que mire si el resultado es exacto o no
                                if (numeroUsuario % i != 0) {

                                    //Si no es exacto, significa que no 
                                    //tiene divisor, entonces cambia a true
                                    esPrimo = true;
                                } else {

                                    //Si es exacto, significa que i es su 
                                    //divisor, entonces no sería primo
                                    esPrimo = false;
                                }
                            }

                            //para que solamente sala 1 vez el resultado
                            //uso la variable anterior
                            if (esPrimo == true) {
                                System.out.println("Es primo");
                            } else {
                                System.out.println("No es primo");
                            }

                        } else if (numeroUsuario == 2) {
                            System.out.println("Es primo");
                        } else {
                            System.out.println("Es par");
                        }

                    } else {
                        System.out.println("Introduzca un número entre 2 y 600_000_000");
                    }
                    break;

                case 2:
                    long numeroR = numeroRandom.nextInt(600_000_000 - 2 + 1) - 2;
                    //Para separar entre números par o impar
                    if (numeroR % 2 != 0 || numeroR == 2) {
                        for (int i = 3; i <= numeroR / 2; i ++) {
                            //La condición hace que mire si el resultado es exacto o no
                            if (numeroR % i != 0) {
                                //Si no es exacto, significa que no 
                                //tiene divisor, entonces cambia a true
                                esPrimo = true;

                            } else {
                                //Si es exacto, significa que i es su 
                                //divisor, entonces no sería primo
                                esPrimo = false;
                            }
                        }
                        //para que solamente sala 1 vez el resultado
                        //uso la variable anterior
                        if (esPrimo == true) {
                            System.out.println("Es primo el número " + numeroR);
                        } else {
                            continue;
                        }

                    } else if (numeroR == 2) {
                        System.out.println("Es primo");
                    } else {
                        System.out.println("Es par");
                    }
                    break;

                case 3:
                    System.out.println("Hasta la próxima");
                    break;

                default:
                    System.out.println("Introduzca un número válido entre 1 y 3");
                    break;

            }

        } while (opcion != 3);

    }

}
