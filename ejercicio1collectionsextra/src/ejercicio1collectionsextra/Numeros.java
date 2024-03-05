/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1collectionsextra;

import java.util.ArrayList;

/**
 *
 * @author pguid
 */
public class Numeros {
  private Integer numeros;

    public Numeros(Integer numeros) {
        this.numeros = numeros;
    }

    public Numeros() {
    }

    public Integer getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Numeros{" + "numeros=" + numeros + '}';
    }
    
}
//Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
//los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).