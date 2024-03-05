/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extrarelaciones;

import ejercicio3extrarelaciones.enumeradores.Color;
import ejercicio3extrarelaciones.enumeradores.Marca;
import ejercicio3extrarelaciones.enumeradores.Tipo;

/**
 *
 * @author pguid
 */
public class vehiculo {
  private String Modelo;
    private int anio;
    private int numMotor;
    private String chasis;
    private Color color;
    private Tipo tipo;
private Marca Marca;
Poliza poliza;
Clientes cliente;
    public vehiculo() {
    }

    public vehiculo(String Modelo, int anio, int numMotor, String chasis, Color color, Tipo tipo, Marca Marca, Poliza poliza, Clientes cliente) {
        this.Modelo = Modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.Marca = Marca;
        this.poliza = poliza;
        this.cliente = cliente;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return Marca;
    }

    public void setMarca(Marca Marca) {
        this.Marca = Marca;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "Modelo=" + Modelo + ", anio=" + anio + ", numMotor=" + numMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", Marca=" + Marca + ", poliza=" + poliza + ", cliente=" + cliente + '}';
    }

   

  
    
}
