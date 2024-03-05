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
public class EdificioDeOficinas  extends Edificio{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
  private double numOficinas,cantPersonasPorOficina,NumPisos,Superficie,Volumen;

    public EdificioDeOficinas() {
    }



    public EdificioDeOficinas(double numOficinas, double cantPersonasPorOficina, double NumPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.NumPisos = NumPisos;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(double numOficinas) {
        this.numOficinas = numOficinas;
    }

    public double getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(double cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public double getNumPisos() {
        return NumPisos;
    }

    public void setNumPisos(double NumPisos) {
        this.NumPisos = NumPisos;
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
        return "EdificioDeOficinas{" + ", numOficinas=" + numOficinas + ", cantPersonasPorOficina=" + cantPersonasPorOficina + ", NumPisos=" + NumPisos + ", Superficie=" + Superficie + ", Volumen=" + Volumen + '}';
    }
  

    @Override
    public double calcularSuperficie() {
     
        Superficie=ancho*largo;
        System.out.println("la superificie del edificioDeOficinas es:  "+Superficie);
        return Superficie;
    }

    @Override
    public double calcularVolumen() {
 
        Volumen=largo*ancho*alto;
        System.out.println("el volumen del edificioDeOficinas es:  "+Volumen);
        return Volumen;
    }
    public void crearOficina(){
                System.out.println("cuantas personas entran en cada oficina");
        this.cantPersonasPorOficina=leer.nextDouble();
        System.out.println("cuantas oficinas hay");
        this.numOficinas=leer.nextDouble();
        System.out.println("cuantos pisos hay?");
        this.NumPisos=leer.nextDouble();
               System.out.println("ancho");
        this.ancho=leer.nextDouble();
        System.out.println("alto");
        this.alto=leer.nextDouble();
           System.out.println("largo");
        this.largo=leer.nextDouble();
               
         
       
    }
    public void cantPersonas(){
        double cantP;
        double pPorPiso;
        
pPorPiso=cantPersonasPorOficina;
        cantP=cantPersonasPorOficina*NumPisos;
        System.out.println("la cantidad de personas por piso es: "+pPorPiso);
        System.out.println("la cantidad de personas que entran son: "+cantP);
    }
    
}
