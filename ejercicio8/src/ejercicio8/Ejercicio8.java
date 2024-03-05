/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import ejercicio8.servicios.sercadena;

/**
 *
 * @author pguid
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sercadena s1= new sercadena();
        s1.ingresarcadena();
        s1.mostrarVocales();
        s1.letraRepetida();
        s1.comparar();
        s1.unirfrase();
        s1.reemplazar();
        s1.contieneLetra();
    }
    
}
