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
    private static Scanner teclado = new Scanner(System.in);
    
    //Método suma. Solo se utiliza en la clase Calculadora
    //Se le pone privado porque solo se usa en esta clase
    //Recibe dos parámetros y devuelve un entero
    //Con el resultado de la suma de los parámetros
    private static int sumar (int a, int b){
        int resultado = a + b;
        return resultado;
    }
    //Método restar. Solo se utiliza en la clase Calculadora
    //Se le pone privado porque solo se usa en esta clase
    //Recibe dos parámetros y devuelve un entero
    //Con el resultado de la resta de los parámetros
    private static int restar (int a, int b){
        int resultado = a - b;
        return resultado;
    }
    
    
    //Método multiplicar. Solo se utiliza en la clase Calculadora
    //Se le pone privado porque solo se usa en esta clase
    //Recibe dos parámetros y devuelve un entero
    //Con el resultado de la multiplicación de los parámetros
    private static int multiplicar (int a, int b){
        int resultado = a * b;
        return resultado;
    }
    
    
    //Método dividir. Solo se utiliza en la clase Calculadora
    //Se le pone privado porque solo se usa en esta clase
    //Recibe dos parámetros y devuelve un entero
    //Con el resultado de la división de los parámetros
    private static int dividir (int a, int b){
        int resultado;
        
        try {
            
            resultado = a / b;
            
        } catch (ArithmeticException ae) {
            
            System.out.println("El valor de operador 2 es 0, con lo cual se pone 2");
            b = 2;
            resultado = a / b;
        }
        
        return resultado;
    }
    
    
    //Método mostrarMenu. Solo se utiliza en la clase Calculadora
    //método privado. Muestra el menú por consola
    private static void mostrarMenu(){
        System.out.println("Opciones del programa"
                + "\n1.Sumar"
                + "\n2.Restar"
                + "\n3.Multiplicar"
                + "\n4.Dividir"
                + "\n5.Salir");
    }
    
    
    private static int leerDato(){
        boolean solicitarDatos = true;
        int numero = 0;
        do{
         do {
                try {
                    //Bloque candidato a lanzar la excepcion
                    //(Podemos hacer el try catch a cada uno, pero esto es para repaso simple)
                    System.out.println("Introduce número: ");
                    numero= teclado.nextInt();

                    //Para controlar que los datos están correctamente introducidos.
                    solicitarDatos = false;
                } catch (InputMismatchException ime) {

                    //Código para tratar el error
                    System.out.println("Se ha introducido texto en lugar de números"
                            + "\nVuelva a introducir los datos");
                    teclado.nextLine();
                }
            } while (solicitarDatos); // Bucle que controla la excepción
        } while (!(numero > -100 && numero < 100) );
    
        return numero;
    
    }

    public static void main(String[] args) {
        

        int operando1 = 0, operando2 = 0;
        String opcion;

        //Comienzo del programa
        System.out.println("Bienvenido al calculator");

        do{
            operando1 = leerDato();
            operando2 = leerDato();
        } while (!((operando1 > -100 && operando1 < 100) && (operando2 > -100 && operando2 < 100)));
        
        teclado.nextLine();
        int resultado = 0;
        do {
            mostrarMenu();

            opcion = String.valueOf(leerDato());

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
            if(!opcion.equals("5") || opcion.equals("1") || opcion.equals("2") 
                    || opcion.equals("3") || opcion.equals("4")){
                System.out.println("El resultado es: " + resultado);
            }
            
        } while (!opcion.equals("5"));
    }

}
