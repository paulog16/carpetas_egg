/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extraherencia.entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre,apellido,estadoCivil;
    protected int identificacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String estadoCivil, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", identificacion=" + identificacion + '}';
    }
    public void crearPersona(){
        System.out.println("ingrese nombre");
        this.nombre=leer.next();
        System.out.println("ingrese apellido");
        this.apellido=leer.next();
        System.out.println("ingrese identificacion");
        this.identificacion=leer.nextInt();
        System.out.println("ingrese estado civil");
        this.estadoCivil=leer.next();
    }
    public void cambiarEstado(){
        System.out.println("indique nuevo estado civil");
        this.estadoCivil=leer.next();
    }
}
