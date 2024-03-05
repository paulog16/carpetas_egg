/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4collections;

import ejercicio4collections.servicios.servpelicula;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio4collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servpelicula ser= new servpelicula();
        Scanner leer= new Scanner(System.in);
        ser.crearPelicula();
                ser.mostrar();
                int opciones;
                
         do {
            System.out.println("MENU");
            System.out.println("1-MOSTRAR PELICULAS MAYORES A UNA HORA");
            System.out.println("2-MOSTRAR PELICULAS EN ORDEN CRECCIENTE");
            System.out.println("3-MOSTRAR PELICULAS EN ORDEN DECRECIENTE");
            System.out.println("4-COMPARAR POT TITULO");
            System.out.println("5-COMPARAR POR DIRECTOR");

            System.out.println("elija una opcion");

            opciones = leer.nextInt();
            switch (opciones) {
                case 1:
                    ser.mayora1();
                    break;
                case 2:
                    ser.ordenarCreciente();
                    break;
                case 3:
                    ser.ordenarDecreciente();
                    break;
                case 4:
                    ser.compararTitulo();
                    break;
                case 5:
                  ser.compararDirector();
                    break;
                case 6:
                    System.out.println("elija una opcion correcta");
                default:
                    System.out.println("ingrese una opcion correcta");
            }

        } while(opciones!=6);
        System.out.println("EL PROGRAMA A FINALIZADO");
//        ser.crearPelicula();
//        ser.mostrar();
//        ser.mayora1();
//        ser.ordenarCreciente();
//        ser.ordenarDecreciente();
//        ser.compararTitulo();
//        ser.compararDirector();
    }
    
}
//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//
//22
//
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.