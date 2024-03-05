/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafacu;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Javafacu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double m;
        do {
            System.out.print("ingrese un numero en millas, ingrese 0 para terminar: ");
            m = leer.nextInt();
            if (m > 0) {
                double k = m * 1.6093;
                System.out.println("las millas en kilometros son: " + k);
            }

        } while (m != 0);
    }

}
