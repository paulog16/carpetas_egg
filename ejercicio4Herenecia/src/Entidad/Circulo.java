/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import ejercicio4herenecia.interfaz.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Circulo implements CalculosFormas {
    private double radio,diametro,area,perimetro;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Circulo() {
    }

    public Circulo(double radio, double diametro, double area, double perimetro) {
        this.radio = radio;
        this.diametro = diametro;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
  
  public void crearCirculo(){
    System.out.println("ingrese el radio del circulo");
   radio=leer.nextDouble();
   calcularArea();
   calcularPerimetro();
}

    @Override
    public void calcularArea() {
      this.area=PI*Math.pow(radio, 2);
        System.out.println("el area del cirulo es: "+area);
    }

    @Override
    public void calcularPerimetro() {
 this.perimetro=PI*(2*radio);
        System.out.println("el perimetro del circulo es: "+perimetro);
    }
    
}
