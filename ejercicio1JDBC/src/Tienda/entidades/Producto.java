/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.entidades;

/**
 *
 * @author pguid
 */
public class Producto {
    
 private Fabricante fabricante;
 
 private int codigo;
 private String nombre;
 private double precio;
 private int codigo_Fabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int codigo_Fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo_Fabricante = codigo_Fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return codigo_Fabricante;
    }

    public void setCodigoFabricante(int codigo_Fabricante) {
        this.codigo_Fabricante = codigo_Fabricante;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
 
 
}
