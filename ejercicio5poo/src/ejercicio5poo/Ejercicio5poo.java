/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5poo;

import ejercicio5poo.servicios.Cuentaserv;

/**
 *
 * @author pguid
 */
public class Ejercicio5poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Cuentaserv s1= new Cuentaserv();
   s1.crearCuenta();
   s1.Ingreso();
   s1.Retiro();
   s1.extraccion();
   s1.saldo();
   s1.consultarDatos();
    }
    
}
