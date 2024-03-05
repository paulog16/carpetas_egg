/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2poo;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class circunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  private double radio;

    public circunferencia() {
    }

    public circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crear(){
        System.out.println("ingrese radio");
        this.radio=leer.nextDouble();
    }
       public void area(){
        double area;
        area=3.14*(radio*radio);
           System.out.println("el area es: "+area);
    }
       public void perimetro(){
           double perimetro;
           perimetro=2*3.14*radio;
           System.out.println("el perimetro es: "+perimetro);
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