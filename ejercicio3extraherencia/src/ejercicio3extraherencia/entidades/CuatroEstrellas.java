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
public class CuatroEstrellas extends Hoteles{
    protected String gimnasio,nombreResto;
protected int capacidadResto;
    public CuatroEstrellas() {
    }


    public CuatroEstrellas(String gimnasio, String nombreResto, int capacidadResto, String nombre, String direccion, String localidad, String Gerente) {
        super(nombre, direccion, localidad, Gerente);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
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
        return "CuatroEstrellas{"+super.toString() + "gimnasio=" + gimnasio + ", nombreResto=" + nombreResto + ", capacidadResto=" + capacidadResto + '}';
    }
    
    public void crear(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearHotel();
            System.out.println("ingrese el tipo de gym");
 
    do{
           this.gimnasio=leer.next();
           if(!gimnasio.equalsIgnoreCase("a")&& !gimnasio.equalsIgnoreCase("b")){
               System.out.println("letra incorrecta");
           }
    }while(!gimnasio.equalsIgnoreCase("a")&& !gimnasio.equalsIgnoreCase("b"));
    System.out.println("ingrese nombre de restorant");
    this.nombreResto=leer.next();
    System.out.println("ingrese capacidad de resto");
    this.capacidadResto=leer.nextInt();
calcularPrecio();
    }
    public int calcularPrecio(){
      int precioGim=0;
      if(gimnasio.equalsIgnoreCase("a")){
          precioGim=50;
      }else{
          precioGim=30;
      }
      int precioR;
      if(capacidadResto<30 ){
           precioR=10;
      }else if(capacidadResto>=30 && capacidadResto<=50){
          precioR=30;
      }else{
          precioR=50;
      }
      precioHabitacion=super.calcularPrecios()+precioGim+precioR;
      return precioHabitacion;
        
    }
    
}
