/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones;




/**
 *
 * @author pguid
 * 
 */
 
public class Jugador  {
    private int id;
    private String nombre;
    private boolean mojado;
private String nombrecompleto;
    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado, String nombrecompleto) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
        this.nombrecompleto = nombre+id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

   

   

  

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + ", nombrecompleto=" + nombrecompleto + '}';
    }

    
}
