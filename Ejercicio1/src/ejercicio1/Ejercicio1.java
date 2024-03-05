/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import servicios.serviciosdatos;

/**
 *
 * @author pguid
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serviciosdatos s1= new serviciosdatos();
        s1.cargarLibro();
        s1.informar();
    }
    
}
