/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo;

import ejercicio3poo.servicios.Serviop;

/**
 *
 * @author pguid
 */
public class Ejercicio3poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Serviop s1= new Serviop();
        s1.crearOperacion();
        s1.sumarRestar();
        s1.multiplicar();
        s1.division();
    }
    
}
