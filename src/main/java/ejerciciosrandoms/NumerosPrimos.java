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

        do {
            System.out.println("Bienvenido al programa de detector de números primos"
                    + "\n1.Introduces el número y te decimos si es primo o no"
                    + "\n2.Te damos un número primo de forma aleatoria"
                    + "\n3.Salir");
            opcion = teclado.nextInt();
            

            //Switch que controla las opciones
                switch(opcion){
                    
                    case 1:
                        
                        System.out.println("Ha elegido que le digamos si el "
                                + "número que nos diga es primo o no"
                                + "\nIntroduzca un número entre 2 y 600_000_000");
                        long numeroUsuario = teclado.nextInt();
                        
                        //Para que el número esté dentro del rango correcto
                        if (numeroUsuario >= 2 && numeroUsuario <= 600_000_000) {

                            //Para separar entre números par o impar
                            if (!(numeroUsuario % 2 == 0 && numeroUsuario != 2)) {
                                
                                
                                
                                
                            } else {
                                System.out.println("Es par");
                            }
                            
                        } else {
                            System.out.println("Introduzca un número entre 2 y 600_000_000");
                        }
                        break;
                        
                    case 2:
                        
                        
                        break;
                        
                    case 3:
                        
                        
                        break;
                        
                    default:
                        System.out.println("Introduzca un número válido entre 1 y 3");
                        break;
                
                
                
                }
          
        } while (opcion != 3);

    }

}
