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
public class Hoteles extends Alojamiento {
    protected int numHabitaciones,numCamas,numPisos,precioHabitacion;

    public Hoteles() {
    }

    public Hoteles(String nombre, String direccion, String localidad, String Gerente) {
        super(nombre, direccion, localidad, Gerente);
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String Gerente) {
        this.Gerente = Gerente;
    }

    @Override
    public String toString() {
        return super.toString()+"Hoteles{" + "numHabitaciones=" + numHabitaciones + ", numCamas=" + numCamas + ", numPisos=" + numPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }
protected void crearHotel(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    super.crearAlojamiento();
    System.out.println("ingrese numero de habitaciones");
    this.numHabitaciones=leer.nextInt();
    System.out.println("ingrese numero de camas");
    this.numCamas=leer.nextInt();
    System.out.println("ingrese numero de pisos");
    this.numPisos=leer.nextInt();
   
  this.precioHabitacion=50;
          }
   protected int calcularPrecios(){
       int var=numHabitaciones*numCamas*numPisos;
     this.precioHabitacion=50+(var);
     return precioHabitacion;
   }
}
