/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extrarelaciones;

import java.util.Date;

/**
 *
 * @author pguid
 */
public class Cuota {
     private int numCuota;
    private double montoTotal;
    private boolean isPagada;
    private Date fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(int numCuota, double montoTotal, boolean isPagada, Date fechaVencimiento, String formaPago) {
        this.numCuota = numCuota;
        this.montoTotal = montoTotal;
        this.isPagada = isPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isIsPagada() {
        return isPagada;
    }

    public void setIsPagada(boolean isPagada) {
        this.isPagada = isPagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numCuota=" + numCuota + ", montoTotal=" + montoTotal + ", isPagada=" + isPagada + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
}
