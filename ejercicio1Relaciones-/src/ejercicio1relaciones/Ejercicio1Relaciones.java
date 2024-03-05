/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1relaciones;

import ejercicio1relaciones.servicios.serviciosPerro;
import ejercicio1relaciones.servicios.serviciosPersona;

/**
 *
 * @author pguid
 */
public class Ejercicio1Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serviciosPersona sper= new serviciosPersona();
        serviciosPerro sperro= new serviciosPerro();
   
         sperro.crearPerros();
          sperro.mostrarPerros();
   sper.crearPersona(sperro);

    


    }
    
}
