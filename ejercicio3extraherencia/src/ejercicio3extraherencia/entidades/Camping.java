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
public class Camping extends extraHoteleros{
    private int capmaxCarpas,cantBaños;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(int metrosCuadrados, boolean privado, String nombre, String direccion, String localidad, String Gerente) {
        super(metrosCuadrados, privado, nombre, direccion, localidad, Gerente);
    }

    public int getCapmaxCarpas() {
        return capmaxCarpas;
    }

    public void setCapmaxCarpas(int capmaxCarpas) {
        this.capmaxCarpas = capmaxCarpas;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Camping{"+super.toString() + "capmaxCarpas=" + capmaxCarpas + ", cantBa\u00f1os=" + cantBaños + ", restaurant=" + restaurant + '}';
    }
    public void crearCamping(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearAlojamiento();
    System.out.println("ingrese capmaxcarpas ");
    this.capmaxCarpas=leer.nextInt();
    System.out.println("ingrese cantbaños");
    this.cantBaños=leer.nextInt();
    System.out.println("tiene restorant?s/n");
    this.restaurant=leer.next().equalsIgnoreCase("s");
    
    
}
}
