/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extracollections;

import ejercicio4extracollections.servicios.ServiciosMapas;

/**
 *
 * @author pguid
 */
public class Ejercicio4extracollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosMapas serv= new ServiciosMapas();
        System.out.println("CARGAR CIUDADES....");
serv.cargarCiudades();
        System.out.println("----------------------");
        System.out.println("BUSCAR CIUDADES....");
serv.Buscar();
        System.out.println("-------------------");
        System.out.println("AGREGAR CIUDADES....");
serv.agregarCiudad();
        System.out.println("---------------------");
        System.out.println("ELIMINAR 3 CIUDADES");
serv.eliminar();
    }
    
}
//Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
//página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
//numero.
//• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
//• Muestra por pantalla los datos introducidos
//• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
//• Muestra por pantalla los datos
//• Agregar una ciudad con su código postal correspondiente más al HashMap.
//• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
//• Muestra por pantalla los datos