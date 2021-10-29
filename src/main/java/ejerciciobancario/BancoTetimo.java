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
        int edadCliente;
        double dineroSolicitado;
        int salir;
        int anios;
        double resultadoSolicitante;

        //Do-While que hace que el programa se ejecute continuamente hasta 
        //que no se le de a 0 en el incio
        do {
            System.out.println("Vamos a calcular si es posible concederle el préstamo"
                    + "\nEscriba 0 para salir"
                    + "\nEscriba 1 para comenzar");
            salir = teclado.nextInt();

            if (salir == 1) {
                do {
                    //Preguntamos edad
                    System.out.println("Introduzca su edad");
                    edadCliente = teclado.nextInt();

                    System.out.println("Introduzca su sueldo bruto mensual");
                    double sueldoBruto = teclado.nextDouble();

                    //Para que únicamente puedan pedir el préstamo mayores de edad 
                    //y menores de 65 años
                    if (edadCliente < 65 && edadCliente >= 18) {
                        do {
                            
                            System.out.println("¿Cuánto dinero desea solicitar?");
                            dineroSolicitado = teclado.nextDouble();

                            resultadoSolicitante = (sueldoBruto * 12) * 5.85;

                            //Para que el cliente únicamente pida el dinero que puede
                            if (dineroSolicitado <= resultadoSolicitante) {
                                
                                do {
                                    System.out.println("¿En cuántos años quiere devolver la hipoteca?");
                                    anios = teclado.nextInt();

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
                                } while (!(anios <= 30 && anios >= 5));
                                
                                
                            } else {
                                System.out.println("No puede pedir esa cantidad, pruebe con menos dinero");
                            }
                            
                            
                        } while (!(dineroSolicitado <= resultadoSolicitante));
                        
                        
                    } else {
                        System.out.println("No se le concede el préstamo por la edad");
                    }
                    
                    
                } while (!(edadCliente >= 18 && edadCliente < 65));
                
                
            } else {
                System.out.println("Hasta la próxima");
            }
            
            
        } while (salir != 0);
        
    }
}
