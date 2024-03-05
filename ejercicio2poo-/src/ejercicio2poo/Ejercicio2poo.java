/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2poo;

/**
 *
 * @author pguid
 */
public class Ejercicio2poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circunferencia c1= new circunferencia();
        c1.crear();
        c1.area();
        c1.perimetro();
    }
    
}
//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).