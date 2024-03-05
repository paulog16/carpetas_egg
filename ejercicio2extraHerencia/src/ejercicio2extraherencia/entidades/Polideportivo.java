/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extraherencia.entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Polideportivo extends Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  private String nombre;
  private boolean techado;
private double Superficie,Volumen;

    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo) {
        super(ancho, alto, largo);
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double Superficie) {
        this.Superficie = Superficie;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setVolumen(double Volumen) {
        this.Volumen = Volumen;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + ", Superficie=" + Superficie + ", Volumen=" + Volumen + '}';
    }

 
   

    

   

  
  

  

    public double calcularSuperficie() {
     
        Superficie=ancho*largo;
            System.out.println("la superificie del polideportivo es:  "+Superficie);
        return Superficie;
    }

 

    @Override
    public double calcularVolumen() {
    

     
        Volumen=largo*ancho*alto;
         System.out.println("el volumen del Polideportivo es:"+Volumen);
        return Volumen;
         
    }
        public void crearPolideportivo(){
            techado=false;
            System.out.println("ingrese nombre del polideportivo");
            this.nombre=leer.next();
            System.out.println("es techado?s/n");
            String op=leer.next();
            if(op.equalsIgnoreCase("s")){
                techado=true;
            }else{
                techado=false;
            }
                     System.out.println("ancho");
        this.ancho=leer.nextDouble();
        System.out.println("alto");
           this.alto=leer.nextDouble();
          System.out.println("largo");
        this.largo=leer.nextDouble();
          
    }
    
}
