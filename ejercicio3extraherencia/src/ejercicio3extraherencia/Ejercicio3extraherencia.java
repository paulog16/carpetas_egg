/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3extraherencia;

import ejercicio3extraherencia.entidades.Alojamiento;
import ejercicio3extraherencia.entidades.Camping;
import ejercicio3extraherencia.entidades.CuatroEstrellas;
import ejercicio3extraherencia.entidades.Hoteles;
import ejercicio3extraherencia.entidades.Residencia;
import ejercicio3extraherencia.entidades.cincoEstrellas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio3extraherencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alojamiento> listaAlojamientos = new ArrayList();
        
Alojamiento alojamiento=new Alojamiento();
     
        int op;
        do {
            CuatroEstrellas cuatro = new CuatroEstrellas();
            cincoEstrellas cinco = new cincoEstrellas();
            Camping camping = new Camping();
            Residencia residencia = new Residencia();
            System.out.println("menu");
            System.out.println("1-crear hotel 4 estrellas");
            System.out.println("2-crear hotel 5 estrellas");
            System.out.println("3-crear camping");
            System.out.println("4-crear Residencia");
            System.out.println("5-Mostrar todos los allojamientos");
            System.out.println("6-hoteles de mas caro a mas baratos");
            System.out.println("7-todos los camping con restaurantes");
            System.out.println("8-todas las residencias con descuentos");
            System.out.println("9-salir");
            
            
            
            op = leer.nextInt();
            switch (op) {
                case 1:
                    cuatro.crear();
                    listaAlojamientos.add(cuatro);
                    break;
                case 2:
                    cinco.crearCinco();
                    listaAlojamientos.add(cinco);
                    break;
                case 3:
                    camping.crearCamping();
                    listaAlojamientos.add(camping);
                    break;
                case 4:
                    residencia.crearResidencia();
                    listaAlojamientos.add(residencia);
                    break;
                case 5:
                    for (Alojamiento aux : listaAlojamientos) {
                        System.out.println(aux);
                    }
                    break;
                case 6:
                 hotelesOrdenados(listaAlojamientos);
                    break;
                case 7:

                    mostrarCampingsRestaurante(listaAlojamientos);
                    break;
                case 8:
                    residenciasDescuento(listaAlojamientos);
                    break;
                case 9:
                    System.out.println("saliendo");
                    break;
            }
        } while (op != 9);
        
        
    }
    
    public static void mostrarCampingsRestaurante(ArrayList<Alojamiento> listaAlojamientos){
        for (Alojamiento aux : listaAlojamientos) {
             if (aux instanceof Camping) {

                Camping nose = (Camping) aux;
            
                if (nose.isRestaurant()) {
                    System.out.println(nose);
                }
        }
    }
       


    }
    public static void residenciasDescuento(ArrayList<Alojamiento> listaAlojamientos){
        for (Alojamiento aux : listaAlojamientos) {
            if(aux instanceof Residencia){
                Residencia pepe= (Residencia)aux;
                if(pepe.isDescuento()){
                    System.out.println(pepe);
                }
            }
        }
    }

 public static void hotelesOrdenados(ArrayList<Alojamiento> listaAlojamientos){
     ArrayList<Hoteles> hotelesOrdenados = new ArrayList();
        for (Alojamiento aux : listaAlojamientos) {
            if(aux instanceof Hoteles){
                Hoteles hotel= (Hoteles) aux;
             hotelesOrdenados.add(hotel);
         
            }
            
          
        }
          Collections.sort(hotelesOrdenados, new Comparator<Hoteles>() {
       
            public int compare(Hoteles hotel1, Hoteles hotel2) {
                return hotel2.getPrecioHabitacion()- hotel1.getPrecioHabitacion();
                 
            }
        
        });
mostrar(hotelesOrdenados);
    }
public static void mostrar(ArrayList<Hoteles> hotelesOrdenados){
    for (Hoteles aux : hotelesOrdenados) {
        System.out.println(aux);
    }
}
    }



