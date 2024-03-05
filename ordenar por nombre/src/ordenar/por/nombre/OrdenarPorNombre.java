/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar.por.nombre;

import ordenar.por.nombre.servicios.serviciosPro;

/**
 *
 * @author pguid
 */
public class OrdenarPorNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     serviciosPro ser= new serviciosPro();
     ser.cargarProductos();
     
     ser.mostrarOrden();
    }
    
}
