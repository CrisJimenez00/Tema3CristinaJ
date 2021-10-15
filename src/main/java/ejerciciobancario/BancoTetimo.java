/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobancario;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class BancoTetimo {

    public static void main(String[] args) {

        //Delcaramos el Scanner
        Scanner teclado = new Scanner(System.in);

        //Declaramos variables
        boolean apto;//True si es apto, false si no es apto

        //Preguntamos edad
        System.out.println("Introduzca su edad");
        int edadCliente = teclado.nextInt();

        System.out.println("Introduzca su sueldo bruto mensual");
        double sueldoBruto = teclado.nextDouble();

        //Para que únicamente puedan pedir el préstamo mayores de edad 
        //y menores de 65 años
        if (edadCliente < 65 && edadCliente >= 18) {

            System.out.println("¿Cuánto dinero desea solicitar?");
            double dineroSolicitado = teclado.nextDouble();

            double resultadoSolicitante = (sueldoBruto * 12) * 5.85;

            //Para que el cliente únicamente pida el dinero que puede
            if (dineroSolicitado <= resultadoSolicitante) {

                System.out.println("¿En cuántos años quiere devolver la hipoteca?");
                int anios = teclado.nextInt();

                //Condición para que se cumpla el tiempo de pago
                if (anios <= 30 && anios >= 5) {
                    
                    int aniosLimite = anios + edadCliente;

                    //Condición para que no supere los 75 años pagando
                    if (aniosLimite > 75) {
                        
                        System.out.println("No se le puede conceder el préstamo porque supera los 75 años pagando");
                    } else {

                        System.out.println("FELICIDADES, SE LE HA CONCEDIDO EL PRÉSTAMO");
                    }

                } else {

                    System.out.println("No le podemos conceder el préstamo por el tiempo");
                }

            } else {
                System.out.println("No puede pedir esa cantidad, pruebe con menos dinero");
            }

        } else {
            System.out.println("No se le concede el préstamo por la edad");
        }

    }

}
