/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasopoo1.entidades;

import java.util.Date;

/**
 *
 * @author pguid
 */
public class ClaseUsuario {

    private String nombre;
    private String apellido;
    private String dni;
    private Date nacimineto;
    private String pais;

    public ClaseUsuario() {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getNacimineto() {
        return nacimineto;
    }

    public void setNacimineto(Date nacimineto) {
        this.nacimineto = nacimineto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
