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

    //Método privado el cual hace que la edad sea válida entre 18 y 65 años.
    //Devuelve boolean para ver si se cumple o no
    private static boolean edadValida(int edadUsuario) {
        boolean resultado;
        if (edadUsuario < 65 && edadUsuario >= 18) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;

    }

    //Método privado el cual hace que el dinero que se pida no sea mayor al sueldo anual bruto
    //Devuelve boolean para ver si se cumple o no
    private static boolean requisitoSolicitante(double dineroPedir, double sueldo, double factorMultiplicativo) {
        boolean resultado;

        //Calcula el sueldo bruto anual multiplicado por el factor multiplicativo
        double resultadoCuenta = (sueldo * 12) * factorMultiplicativo;

        if (dineroPedir < resultadoCuenta) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    //Método privado el cual comprueba que los años que los usuarios 
    //pagando la hipoteca entra dentro de unos márgenes
    private static boolean comprobarAnios(int anios, int edadCliente) {
        boolean resultado = true;
        int aniosLimite = anios + edadCliente;

        if ((anios <= 30 && anios >= 5) && aniosLimite < 75) {

            resultado = true;

        } else {

            resultado = false;
        }

        return resultado;
    }

    public static void main(String[] args) {
        //Declaramos el Scanner
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
                    if (edadValida(edadCliente)) {
                        do {

                            System.out.println("¿Cuánto dinero desea solicitar?");
                            dineroSolicitado = teclado.nextDouble();

                            //Para que el cliente únicamente pida el dinero que puede
                            if (requisitoSolicitante(dineroSolicitado, sueldoBruto, 5.85)) {

                                do {
                                    System.out.println("¿En cuántos años quiere devolver la hipoteca?");
                                    anios = teclado.nextInt();

                                    //Condición para que se cumpla el tiempo de pago
                                    if (comprobarAnios(anios, edadCliente)) {
                                        System.out.println("FELICIDADES, SE LE HA CONCEDIDO EL PRÉSTAMO");

                                    } else {

                                        System.out.println("No se le puede conceder el préstamo por el tiempo");
                                    }

                                } while (!(comprobarAnios(anios, edadCliente)));

                            } else {
                                System.out.println("No puede pedir esa cantidad, pruebe con menos dinero");
                            }

                        } while (!requisitoSolicitante(dineroSolicitado, sueldoBruto, 5.85));

                    } else {
                        System.out.println("No se le concede el préstamo por la edad");
                    }

                } while (!(edadValida(edadCliente)));

            } else {
                System.out.println("Hasta la próxima");
            }

        } while (salir != 0);

    }
}
