/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import ejercicio13.servicios.servicur;

/**
 *
 * @author pguid
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicur s1= new servicur();
            Curso Curso= new Curso();
            Curso= s1.crearCurso();
            s1.ganancias(Curso);
    }
    
}
