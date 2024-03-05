/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7poo;

import ejercicio7poo.servicios.personaserv;

/**
 *
 * @author pguid
 */
public class Ejercicio7poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       personaserv s1= new personaserv();
        System.out.println("PERSONA 1");
       s1.crearPersona();
       s1.calcularIMC();
       s1.esMayordeEdad();
       personaserv s2= new personaserv();
        System.out.println("PERSONA 2");
       s2.crearPersonaa();
       s2.caalcularIMC();
       s2.esMaayordeEdad();
    }
    
}
