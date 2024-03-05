/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

import ejercicio8poo.servicios.Cadenaserv;

/**
 *
 * @author pguid
 */
public class Ejercicio8poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Cadenaserv s1= new Cadenaserv();
       s1.crearCadena();
       s1.mostrarVocales();
       s1.invertirFrase();
       s1.vecesRepetido();
       s1.compararLongitud();
       s1.unirFrases();
       s1.Reemplazar();
       s1.contiene();
    }
    
}
