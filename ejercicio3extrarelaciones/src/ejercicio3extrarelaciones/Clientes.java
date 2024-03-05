/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extrarelaciones;

import ejercicio3extrarelaciones.enumeradores.Apellidos;
import ejercicio3extrarelaciones.enumeradores.nombre;
import java.util.ArrayList;

/**
 *
 * @author pguid
 */
public class Clientes  {

   private Apellidos apellido;
    private nombre nombre;
    private String email;
    private String dni;
    private String domicilio;
    private int numTel;
ArrayList<Poliza>poliza= new ArrayList();
ArrayList<vehiculo>vehiculo= new ArrayList();

    public Clientes() {
    }

    public Clientes(Apellidos apellido, nombre nombre, String email, String dni, String domicilio, int numTel) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.domicilio = domicilio;
        this.numTel = numTel;
    }

    public Apellidos getApellido() {
        return apellido;
    }

    public void setApellido(Apellidos apellido) {
        this.apellido = apellido;
    }

    public nombre getNombre() {
        return nombre;
    }

    public void setNombre(nombre nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public ArrayList<Poliza> getPoliza() {
        return poliza;
    }

    public void setPoliza(ArrayList<Poliza> poliza) {
        this.poliza = poliza;
    }

    public ArrayList<vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "apellido=" + apellido + ", nombre=" + nombre + ", email=" + email + ", dni=" + dni + ", domicilio=" + domicilio + ", numTel=" + numTel + ", poliza=" + poliza + ", vehiculo=" + vehiculo + '}';
    }
  
   

 
    
}
