/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author pguid
 */
public class Movil {
    private String modelo,marca;
    private double precio;
            private int ram,almacenamiento;
            private String []codigo;

    public Movil() {
    }

    public Movil(String modelo, String marca, double precio, int ram, int almacenamiento, String[] codigo) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
    }
            
}
