/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4poo;

import ejercicio4poo.servicios.Rectanguloserv;

/**
 *
 * @author pguid
 */
public class Ejercicio4poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectanguloserv s1= new Rectanguloserv();
        s1.crearRectangulo();
        s1.crearPerimetro();
        s1.crearSuperficie();
        s1.mostrarAsteriscos();
    }
    
}
