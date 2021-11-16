/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrandoms;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
//Un método dice un n1 aleatorio entre 2 valores que meten por teclado.
//Le decimos al usuario que lo adivine ese número aleatorio
//Tiene 3 vidas 
//Te ayuda diciéndote si el número es más grande es más pequeño o más
public class EjercicioAleatorio {

    //********METODOS*********
    //*****PARA GENERAR LOS ALEATORIOS********
    //Método privado el cual genera un número aleatorio entre dos 
    //márgenes introducidos por parámetros
    private static int numAleatorio(int numMinimo, int numMaximo) {

        int aleatorio;
        Random random = new Random();

        aleatorio = random.nextInt(numMaximo - numMinimo + 1) + numMinimo;
        return aleatorio;
    }

    //*******PARA LEER DATOS POR TECLADO*******
    //Metodo privado el cual lee los datos por scanner 
    //y controla excepciones(que no se introduzca números en los nextInt())
    private static int leerDato() {
        Scanner teclado = new Scanner(System.in);
        boolean solicitarDatos = true;
        int numero = 0;
        do {
            try {
                //Bloque candidato a lanzar la excepcion
                System.out.println("El número será: ");
                numero = teclado.nextInt();

                //Para controlar que los datos están correctamente introducidos.
                solicitarDatos = false;
            } catch (InputMismatchException ime) {

                //Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números"
                        + "\nVuelva a introducir los datos");
                teclado.nextLine();
            }
        } while (solicitarDatos); // Bucle que controla la excepción

        return numero;

    }

    //*****PARA VER SI EL DATO POR TECLADO ES MAYOR O MENOR AL ALEATORIO******
    //Método privado que se le introduce por parámetros el valor aleatorio 
    //y el valor que introduce el usuario por scanner, si el valor del usuario
    //es mayor al número aleatorio lo indica y si es a la inversa también
    //para así guiar al usuario por el juego
    private static void mayorMenor(int numeroSorpresa, int numeroUsuario) {

        //Para ver si el número es mayor o menor al introducido por teclado
        if (numeroSorpresa > numeroUsuario) {

            System.out.println("El número sorpresa es más grande al número introducido");

        } else {

            System.out.println("El número sorpresa es más pequeño al número introducido");
        }
    }

    //******CONTROLA SI ACIERTAS O NO Y CUANTAS VIDAS QUEDAN******
    //Método privado el cual es el cuerpo del juego y controla si 
    //te quedas sin vidas o  si sigues teniendo
    //El método se usa para ver si ganas, si tienes que seguir probando o si pierdes
    private static void cuerpoJuego(int vidas, int numeroSorpresa) {

        for (int i = 0; i < vidas; i++) {
            System.out.println("Introduce el número que crees que es: ");
            int numeroUsuario = leerDato();

            if (numeroSorpresa == numeroUsuario) {

                System.out.println("Has acertado.");
                break;

            } else if ((vidas - (i + 1)) == 0) {

                System.out.println("Te quedaste sin vidas, prueba a jugar de nuevo");
                System.out.println("El número aleatorio es: " + numeroSorpresa);

            } else {

                System.out.println("Te has equivocado, te quedan: " + (vidas - (i + 1)) + " vidas");
                mayorMenor(numeroSorpresa, numeroUsuario);
            }

        }
    }

    //****CONTROLA LA EXCEPCIÓN DEL ALEATORIO*******
    //Método privado que se le introduce por parámetros las vidas que tendrá
    //el usuario y el número generado de forma aleatoria.
    //Controla que no se introduzca el valor mayor en el mínimo y el menor en el máximo
    private static void controlExcepcion(int vidas, int numeroSorpresa) {

        boolean repetir = true;
        do {
            try {

                //pide los datos para los márgenes(aquí es posible que se cree el error)
                System.out.println("Introduce el número mínimo ");
                int numMin = leerDato();

                System.out.println("Introduce el número máximo");
                int numMax = leerDato();

                //genera el número aleatorio entre los dos márgenes indicados y lo guarda en una variable
                numeroSorpresa = numAleatorio(numMin, numMax);

                //Si todo es correcto se ejecutará el juego, hasta que no sea correcto no se ejecutará el juego
                cuerpoJuego(vidas, numeroSorpresa);

                //Si ambos números son correctos se cambia la booleana 
                //y hace que no sevuelva a pedir los datos
                repetir = false;

            } catch (IllegalArgumentException iae) {
                System.out.println("Has introducido el número más grande en el mínimo y el más pequeño en el máximo");
                System.out.println("Introduce de nuevo los números");
                //Pensar en cómo hacerlo ejecutable para corregirlo
                //numeroSorpresa = numAleatorio(numMax, numMin);
            }
            //Mientras los valores no sean correctos seguirá pidiendo márgenes
        } while (repetir);
    }

    //****MAIN********
    public static void main(String[] args) {

        //Declaramos e inicializamos las variables
        int vidas = 3;
        int numeroSorpresa = 0;

        System.out.println("Bienvenid@ al programa de adivinar el aleatorio"
                + "\nReglas:"
                + "\n-Introduces un número para el mínimo y para el máximo"
                + "\n-Intenta adivinar el número aleatorio entre los márgenes"
                + "\n-Tienes 3 vidas para divinarlo"
                + "\nDe regalo el programa te ayudará diciendo si "
                + "es mayor o menor al número que has dicho");

        controlExcepcion(vidas, numeroSorpresa);

    }

}
