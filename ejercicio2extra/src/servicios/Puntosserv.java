/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import ejercicio2extra.Puntos;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Puntosserv {
    Scanner leer= new Scanner(System.in);
    Puntos p1= new Puntos();
    public void crearPuntos(){
        System.out.println("ingrese los numeros");
  p1.setX1(leer.nextInt());
  p1.setX2(leer.nextInt());
  p1.setY1(leer.nextInt());
  p1.setY2(leer.nextInt());
        System.out.println(""+p1.getX1());
        System.out.println(""+p1.getX2());
        System.out.println(""+p1.getY1());
        System.out.println(""+p1.getY2());
    }
    public void crearcalculo(){
        double calculo;
        calculo= Math.sqrt((p1.getX2()-p1.getX1())*(p1.getX2()-p1.getX1())+ (p1.getY2()-p1.getY1())*(p1.getY2()-p1.getY1()));
        System.out.println("la distancia es : "+calculo);
    }
}
