/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6poo;

import ejercicio6poo.servicios.cafeteraserv;

/**
 *
 * @author pguid
 */
public class Ejercicio6poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cafeteraserv s1= new cafeteraserv();
        s1.llenarCafetera();
        s1.servirTaza();
        s1.vaciarCafetera();
        s1.agregarCafe();
    }
    
}
