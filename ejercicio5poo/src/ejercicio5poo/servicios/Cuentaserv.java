/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5poo.servicios;

import ejercicio5poo.Cuentabancaria;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Cuentaserv {

    Scanner leer = new Scanner(System.in);
    Cuentabancaria c1 = new Cuentabancaria();

    public void crearCuenta() {

        int dni;
        int numcuenta;
        System.out.println("INGRESE LOS DATOS");
        System.out.println("DNI CLIENTE");
        dni = leer.nextInt();
        c1.setDniCliente(dni);
        System.out.println("NUMERO DE CUENTA");
        numcuenta = leer.nextInt();
        c1.setNumeroCuenta(numcuenta);
        System.out.println("SALDO ACTUAL");
        int saldoactual = leer.nextInt();
        c1.setSaldoActual(saldoactual);

    }

    public void Ingreso() {

        System.out.println("ingrese una cantidad de dinero");
        int ingreso = leer.nextInt();
        c1.setIngreso(ingreso);
        System.out.println("usted ahora tiene " + (ingreso + c1.getSaldoActual()));

    }

    public void Retiro() {

        System.out.println("cuanto desea retirar");
        int retiro = leer.nextInt();
        c1.setRetiro(retiro);
        if (c1.getSaldoActual() + c1.getIngreso() == 0) {
            System.out.println("no tiene dinero en el banco, su saldo es de 0");
        } else {
            System.out.println("su saldo ahora es de " + (c1.getSaldoActual() + c1.getIngreso() - retiro));
        }

    }

    public void extraccion() {

//        extraccion=  c1.getSaldoActual()+c1.getIngreso()-((c1.getSaldoActual()+c1.getIngreso()-c1.getRetiro())*0.20);
        System.out.println("haga una extracion rapdia");
        int extraccion = leer.nextInt();
        c1.setExtraccion(extraccion);
        if (extraccion > (c1.getSaldoActual() + c1.getIngreso() - c1.getRetiro()) * 0.20) {
            System.out.println("incorrecto, es mas de lo solicitado");
        } else {
            System.out.println("usted saco" + extraccion + "de su sueldo actual");
        }

    }

    public void saldo() {
        double saldofinal;
        saldofinal = c1.getSaldoActual() + c1.getIngreso() - c1.getRetiro() - c1.getExtraccion();
        System.out.println("el saldo final es de " + saldofinal);

    }

    public void consultarDatos() {
        System.out.println("DNI");
        System.out.println("" + c1.getDniCliente());
        System.out.println("NUMERO DE CUENTA");
        System.out.println("" + c1.getNumeroCuenta());
        System.out.println("SALDO ACTUAL");
        System.out.println("" + (c1.getSaldoActual() + c1.getIngreso() - c1.getRetiro() - c1.getExtraccion()));

    }
}
