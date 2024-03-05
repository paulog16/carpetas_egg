/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacolec;

import practicacolec.servicios.serviciosPerros;

/**
 *
 * @author pguid
 */
public class Practicacolec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serviciosPerros serv= new serviciosPerros();
       
        serv.fabricaPerros();
        serv.mostrar();
        serv.eliminarPerro();

    }
    
}
