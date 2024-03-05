/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extrarelaciones;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pguid
 */
public class Poliza {
    vehiculo vehiculo;
    Clientes cliente;
    ArrayList<Cuota> cuota= new ArrayList();
    
   Clientes clientes= new Clientes();
    private int numPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantCuotas;
    private String formaPago;
    private double montoTotalAsegurado;
    private boolean granizo;
    private double montoMaxGranizo;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(vehiculo vehiculo, Clientes cliente, int numPoliza, Date fechaInicio, Date fechaFin, int cantCuotas, String formaPago, double montoTotalAsegurado, boolean granizo, double montoMaxGranizo, String tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cuota> getCuota() {
        return cuota;
    }

    public void setCuota(ArrayList<Cuota> cuota) {
        this.cuota = cuota;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", cuota=" + cuota + ", clientes=" + clientes + ", numPoliza=" + numPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantCuotas=" + cantCuotas + ", formaPago=" + formaPago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", granizo=" + granizo + ", montoMaxGranizo=" + montoMaxGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }

   
}
