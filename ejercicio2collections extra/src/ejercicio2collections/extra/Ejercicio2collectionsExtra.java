/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2collections.extra;

import ejercicio2collections.extra.servicios.servicios;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio2collectionsExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicios ser = new servicios();
        Scanner leer = new Scanner(System.in);
        ser.cargar();
        ser.mostrar();
        int op;
      
        do {
              System.out.println("LISTA DE OPCIONES: ");

        System.out.println("1-AGREGAR OTRO ARTISTA");
        System.out.println("2-ELIMINAR UN ARTISTA");
        System.out.println("3-SALIR");
        System.out.println("INGRESE UNA OPCION...");
        op = leer.nextInt(); 
            switch (op) {

                case 1:
                    ser.agregar();
                    break;
                case 2:
                    ser.eliminar();
                    break;
                case 3:
                    System.out.println("finalizando programa");
                    break;
                default:
                    System.out.println("no existe esa opcion");
                    break;
            }
        } while (op != 3);
    }

}
