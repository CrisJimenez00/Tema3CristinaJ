/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseleccion;

/**
 *
 * @author Cris
 */
public class Ej03 {

    public static void main(String[] args) {

        //Ejercicio a = devuelve valor1
        boolean unaCondicion = true;
        String resultado = unaCondicion ? "valor1" : "valor2";

        System.out.println(resultado);

        //Ejercicio b = devuelve 100
        int x = 10;
        int y = (x > 9) ? 100 : 200;

        System.out.println(y);

        //Ejercicio c = devuelve está todo vendido
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente" : (vendidas < aforo)
                ? "Aun no hemos vendido todo" : "Esta todo vendido";

        System.out.println(status);
    }

}
