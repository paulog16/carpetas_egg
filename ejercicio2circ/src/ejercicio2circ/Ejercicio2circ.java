//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
package ejercicio2circ;

import ejercicio2circ.servicios.ServiciosCircunferencia;

public class Ejercicio2circ {

    public static void main(String[] args) {
        ServiciosCircunferencia s1 = new ServiciosCircunferencia();
        s1.crearCircunferencia();
                s1.calcularArea();
s1.Perimetro();
    }

}
