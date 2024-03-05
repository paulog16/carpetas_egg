/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2circ.servicios;

import ejercicio2circ.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class ServiciosCircunferencia {
      Scanner leer= new Scanner (System.in);
        Circunferencia c1= new Circunferencia();
    public void crearCircunferencia() {
  double radio;    
        System.out.println("ingrese radio");
         radio = leer.nextDouble();
         c1.setRadio(radio);
    }
    public void calcularArea() {
        double area;
        area= 3.14*(c1.getRadio()*c1.getRadio());
        System.out.println("el area de la circunferencia es : "+area);
        
    }

   

    public void Perimetro() {
        double perimetro;
        perimetro = 2* 3.14* c1.getRadio();
        System.out.println("el perimtero de la circunferencia es : "+perimetro);
        
        //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
    }
}
