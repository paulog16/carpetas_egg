/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.servicios.servrect;

/**
 *
 * @author pguid
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servrect s1= new servrect();
        s1.crearRect();
        s1.calcularSuperficieYperimetro();
        s1.mostrarAsteriscos();
    }
    
}
