/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extraherencia.entidades;

/**
 *
 * @author pguid
 */
public class Alumnos extends Persona{
    private int curso;

    public Alumnos() {
    }

    public Alumnos(int curso, String nombre, String apellido, String estadoCivil, int identificacion) {
        super(nombre, apellido, estadoCivil, identificacion);
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumnos{" + "curso=" + curso + '}';
    }
    public void crearAlumno(){
        super.crearPersona();
        System.out.println("ingrese curso en el que esta matriculado");
        this.curso=leer.nextInt();
    }
    public void nuevoCurso(){
        System.out.println("indique nuevo curso");
        this.curso=leer.nextInt();
    }
}
