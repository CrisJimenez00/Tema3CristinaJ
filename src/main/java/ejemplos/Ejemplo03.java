/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Cris
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        int cotizacion = 150; // Un valor cualquiera
        char categoriaProfesional;

        if (cotizacion < 80) {
            categoriaProfesional = 'C';
        } else {
            if (cotizacion < 120) {
                categoriaProfesional = 'B';
            } else {
                categoriaProfesional = 'A';
            }
        }

        System.out.println("Cotización " + cotizacion + " euros, ");
        System.out.println("Categoría " + categoriaProfesional + " de ");

        switch (categoriaProfesional) {

            case 'A':
                System.out.print("Socio ");

                break;

            case 'B':
                System.out.print("Senior ");

                break;

            case 'C':
                System.out.print("Junior ");

                break;

            default:
                System.out.print("¡Indefinida! ");

                break;

        }

        int calificacion = 9;

        switch (calificacion) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");

                break;

            case 5:
                System.out.println("Aprobado");

                break;

            case 6:
                System.out.println("Bien");

                break;

            case 7:

            case 8:
                System.out.println("Notable");

                break;

            case 9:
                System.out.println("Sobresaliente");

                break;

            case 10:
                System.out.println("Matrícula");
                break;

            default:
                System.out.println("No presentado");
                break;
        }

    }

}
