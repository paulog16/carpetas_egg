/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import ejercicio14.servicios.sermovil;

/**
 *
 * @author pguid
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sermovil s1= new sermovil();
        Movil celu1,celu2= new Movil();
//        Movil celu2= new Movil();
        
        celu1= s1.cargarMovil();
        celu2= s1.cargarMovil();
        System.out.println(celu1.toString());
        System.out.println(celu2.toString());
    }
    
}
