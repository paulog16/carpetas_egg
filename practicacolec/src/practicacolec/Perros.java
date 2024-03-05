/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacolec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author pguid
 */
public class Perros {
    private String raza,nombre;

    public Perros() {
    }

    public Perros(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perros{" + "raza=" + raza + ", nombre=" + nombre + '}';
    }
    public static void ordenarPorRaza(ArrayList<Perros>ListaRaza){
        //definimos un comparador
        Comparator<Perros>comparadorRaza= new Comparator<Perros>(){
         public int compare(Perros perro1,Perros perro2){
             return perro1.getRaza().compareTo(perro2.getRaza());
         }   
        };
        //ordenamos la lista utilizando el comparador
        Collections.sort(ListaRaza,comparadorRaza);
        System.out.println("lista completa:");
        ListaRaza.forEach((mostrar)->System.out.println(mostrar));
  }
}
