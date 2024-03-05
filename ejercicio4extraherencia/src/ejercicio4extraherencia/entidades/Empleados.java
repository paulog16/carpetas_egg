/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extraherencia.entidades;

/**
 *
 * @author pguid
 */
public class Empleados extends Persona{
    private int añoIncorporacion,numDespacho;

    public Empleados() {
    }

    public Empleados(int añoIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int identificacion) {
        super(nombre, apellido, estadoCivil, identificacion);
        this.añoIncorporacion = añoIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(int añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "a\u00f1oIncorporacion=" + añoIncorporacion + ", numDespacho=" + numDespacho + '}';
    }
    public void crearEmpleado(){
        super.crearPersona();
        System.out.println("ingrese año de incorporacion");
        this.añoIncorporacion=leer.nextInt();
        System.out.println("ingrese numero de despacho");
        this.numDespacho=leer.nextInt();
    }
    public void cambiarDespacho(){
        System.out.println("ingrese nuevo num de despacho");
        this.numDespacho=leer.nextInt();
    }
}
