/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extraherencia.entidades;

/**
 *
 * @author pguid
 */
public class PersonalServicio extends Empleados {
    private String departamento;

    public PersonalServicio() {
    }

    public PersonalServicio(String departamento, int añoIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int identificacion) {
        super(añoIncorporacion, numDespacho, nombre, apellido, estadoCivil, identificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+"PersonalServicio{" + "departamento=" + departamento + '}';
    }
    public void crearPersonalServicio(){
       
        super.crearEmpleado();
        System.out.println("ingrese area");
        this.departamento=leer.next();
    }
    public void nuevaSeccion(){
        System.out.println("indique nueva seccion");
        this.departamento=leer.next();
    }
}
