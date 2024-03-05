/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4poo.servicios;

import ejercicio4poo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Rectanguloserv {

    Scanner leer = new Scanner(System.in);
    Rectangulo r1 = new Rectangulo();

    public void crearRectangulo() {

        System.out.println("ingrese base y atlura");
         r1.setBase(leer.nextDouble());
       r1.setAltura(leer.nextDouble());
     

    }

    public void crearSuperficie() {
        double superficie;
        superficie = r1.getBase() * r1.getAltura();
        System.out.println("la superficie es : " + superficie);

    }

    public void crearPerimetro() {
        double perimetro;
        perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("el perimetro es: " + perimetro);

    }

    public void mostrarAsteriscos() {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
              
                if (i == 0 || i == r1.getAltura() - 1 || j == 0 || j == r1.getBase() - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
