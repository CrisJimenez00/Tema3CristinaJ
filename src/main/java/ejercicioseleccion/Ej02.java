/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseleccion;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Ej02 {

    public static void main(String[] args) {
        
        //Declaramos variables e inicializamos la constante
        int numX, valorAbsoluto;
        final int NUMERO = 135;
        String resultado;

        Scanner teclado = new Scanner(System.in);

        //Pedimos datos por teclado
        System.out.println("Introduce número");
        numX = teclado.nextInt();

        //Depende de si es true o false se guardará en el String resultado el resultado correspondiente
        
        //Si el numero introducido por teclado es mayor o igual que 135
        resultado = (numX >= NUMERO) ? "mayor que " + NUMERO : "menor que " + NUMERO;
        System.out.println(resultado);

        //Si el número introducido por teclado es mayor o igual que  0
        resultado = (numX >= 0) ? "Mayor que cero" : "Menor que cero";
        System.out.println(resultado);

        //Si el resultado es negativo saldrá como valor absoluto(siempre positivo)
        valorAbsoluto = (numX >= 0) ? numX : -numX;
        System.out.println("El valor absoluto es: " + valorAbsoluto);
    }

}
