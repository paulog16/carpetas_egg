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
public class Rectangulo implements CalculosFormas{
private double area,perimetro,base,altura;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Rectangulo() {
    }

    public Rectangulo(double area, double perimetro, double base, double altura) {
        this.area = area;
        this.perimetro = perimetro;
        this.base = base;
        this.altura = altura;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
public void crearRectangulo(){
    System.out.println("indique base");
    base=leer.nextDouble();
    System.out.println("indique altura");
altura=leer.nextDouble();
calcularArea();
calcularPerimetro();
}
    @Override
    public void calcularArea() {
       this.area=base*altura;
        System.out.println("el area del rectangulo es: "+area);
    }

    @Override
    public void calcularPerimetro() {
     this.perimetro=(base+altura)*2;
        System.out.println("el perimetro del rectangulo es: "+perimetro);
    }
    

    
}
