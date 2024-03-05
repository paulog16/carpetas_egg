/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5collections;

import ejercicio5collections.servicios.servicios;

/**
 *
 * @author pguid
 */
public class Ejercicio5collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicios ser= new servicios();
        ser.cargarPais();
     
        ser.orden();
        ser.eliminar();
    }
    
}
