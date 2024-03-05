/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5poo;

/**
 *
 * @author pguid
 */
public class Cuentabancaria {
    int numeroCuenta;
    int dniCliente;
    int saldoActual;
int interes;
int ingreso;
int retiro;
int extraccion;
int saldofinal;
    public Cuentabancaria() {
    }

    public Cuentabancaria(int numeroCuenta, int dniCliente, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public int getExtraccion() {
        return extraccion;
    }

    public void setExtraccion(int extraccion) {
        this.extraccion = extraccion;
    }

    public int getSaldofinal() {
        return saldofinal;
    }

    public void setSaldofinal(int saldofinal) {
        this.saldofinal = saldofinal;
    }

   
    
}
