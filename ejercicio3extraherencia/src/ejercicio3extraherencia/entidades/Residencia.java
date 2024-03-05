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
public class Residencia extends extraHoteleros {
    private int cantHabitaciones;
    private boolean descuento,campodeportivo;

    public Residencia() {
    }

    public Residencia(int metrosCuadrados, boolean privado, String nombre, String direccion, String localidad, String Gerente) {
        super(metrosCuadrados, privado, nombre, direccion, localidad, Gerente);
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampodeportivo() {
        return campodeportivo;
    }

    public void setCampodeportivo(boolean campodeportivo) {
        this.campodeportivo = campodeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{"+super.toString() + "cantHabitaciones=" + cantHabitaciones + ", descuento=" + descuento + ", campodeportivo=" + campodeportivo + '}';
    }
    public void crearResidencia(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearextraHotelero();
        System.out.println("ingrese cant habitaciones");
        this.cantHabitaciones=leer.nextInt();
        System.out.println("tiene descuento?s/n");
        this.descuento=leer.next().equalsIgnoreCase("s");
        System.out.println("tiene campo deportivo?s/n");
        this.campodeportivo=leer.next().equalsIgnoreCase("s");
    }
}
