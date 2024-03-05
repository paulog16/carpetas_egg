/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasopoo1.entidades;

/**
 *
 * @author pguid
 */
public class ClaseMascota {

    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private String raza;
    private int edad;
    private boolean cola;

    public ClaseMascota() {
    }

    public int edadRestar(int edadMayor){
        edad-=edadMayor;
        return edad;
    }
    public int restar(int edadMayor, int vueltas){
        for (int i = 0; i < vueltas; i++) {
          edad-=edadMayor;
        }
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    
    
}
