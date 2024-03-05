/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extraherencia.entidades;

/**
 *
 * @author pguid
 */
public class Profesores extends Empleados{
    private String materia;

    public Profesores() {
    }

    public Profesores(String materia, int añoIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int identificacion) {
        super(añoIncorporacion, numDespacho, nombre, apellido, estadoCivil, identificacion);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return  super.toString()+"Profesores{" + "materia=" + materia + '}';
    }
    public void crearProfesor(){
     
        super.crearEmpleado();
        System.out.println("ingrese materia");
        this.materia=leer.next();
    }
    public void cambiarDepartamento(){
        System.out.println("indique nuevo departamneto");
        this.materia=leer.next();
    }
}
