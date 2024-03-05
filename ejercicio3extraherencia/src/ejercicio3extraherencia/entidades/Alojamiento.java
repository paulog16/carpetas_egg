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
public class Alojamiento {
    protected String nombre,direccion,localidad,Gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String Gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.Gerente = Gerente;
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
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", Gerente=" + Gerente + '}';
    }
    protected void crearAlojamiento(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese nombre");
        this.nombre=leer.next();
        System.out.println("ingrese direccion");
        this.direccion=leer.next();
        System.out.println("ingrese localidad");
        this.localidad=leer.next();
        System.out.println("ingrese gerente");
        this.Gerente=leer.next();
    }
}
