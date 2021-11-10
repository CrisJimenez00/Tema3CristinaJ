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
    
    //Método suma. Solo se utiliza en la clase Calculadora
    //Se le pone privado porque solo se usa en esta clase
    //Recibe dos parámetros y devuelve un entero
    //Con el resultado de la suma de los parámetros
    private static int sumar (int a, int b){
        int resultado = a + b;
        return resultado;
    }
    private static int restar (int a, int b){
        int resultado = a - b;
        return resultado;
    }
    private static int multiplicar (int a, int b){
        int resultado = a * b;
        return resultado;
    }
    private static int dividir (int a, int b){
        int resultado = a / b;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int operando1 = 0, operando2 = 0;
        //Variable centinela
        boolean solicitarDatos = true;
        String opcion;

        //Comienzo del programa
        System.out.println("Bienvenido al calculator");

        do {
            //Pedimos a los usuarios los datos correspondientes y controlamos excepciones
            System.out.println("Introduce dos operandos");
            do {
                try {
                    solicitarDatos = true;
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

        teclado.nextLine();
        int resultado = 0;
        do {
            System.out.println("Opciones del programa"
                    + "\n1.Sumar"
                    + "\n2.Restar"
                    + "\n3.Multiplicar"
                    + "\n4.Dividir"
                    + "\n5.Salir");

            opcion = teclado.nextLine();

            switch(opcion){
                case "1":
                    resultado = sumar(operando1, operando2);
                    break;
                    
                case "2":
                    resultado = restar(operando1, operando2);
                    break;
                    
                case "3":
                    resultado = multiplicar(operando1, operando2);
                    break;
                    
                case "4":
                    resultado = dividir(operando1, operando2);
                    break;
                    
                case "5":
                        System.out.println("Hasta la próxima");
                    break;
                    
                default:
                        System.out.println("Introduce un número correcto");
                        
            }
            System.out.println("El resultado es: " + resultado);
        } while (!opcion.equals("5"));
    }

}
