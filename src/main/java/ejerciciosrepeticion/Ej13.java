/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrepeticion;

/**
 *
 * @author cristina
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 65;
        do {

            char letra = (char) num;
            System.out.println(letra + " - " + num);
            num++;

        } while (num <= 90);
    }

}
