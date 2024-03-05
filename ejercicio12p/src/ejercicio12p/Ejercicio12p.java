/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12p;

import ejercicio12p.servicios.serperson;

/**
 *
 * @author pguid
 */
public class Ejercicio12p {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serperson s1= new serperson();
       persona persona1= s1.crearPersona();
       int edad= s1.calcularEdad(persona1);
       s1.menorq(edad);
       s1.mostrar(persona1);
               
    }
    
}
