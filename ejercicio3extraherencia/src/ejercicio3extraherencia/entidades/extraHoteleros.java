/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3extraherencia.entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class extraHoteleros extends Alojamiento {
    protected int metrosCuadrados;
    protected boolean privado;

    public extraHoteleros() {
    }

   

    public extraHoteleros(int metrosCuadrados, boolean privado, String nombre, String direccion, String localidad, String Gerente) {
        super(nombre, direccion, localidad, Gerente);
        this.metrosCuadrados = metrosCuadrados;
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

public void crearextraHotelero(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    System.out.println("ingrese metros cuadrados");
    this.metrosCuadrados=leer.nextInt();
    System.out.println("el hotel es privado?s/n ");
   this.privado=leer.next().equalsIgnoreCase("s");
}

 
    
}
