/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import ejercicio3extra.servicios.serviciosLibreria;

/**
 *
 * @author pguid
 */
public class Ejercicio3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serviciosLibreria serv= new serviciosLibreria();
        serv.CargarLibros();
        serv.mostrar();
        serv.prestamo();
        serv.devolucion();
    }
    
}
