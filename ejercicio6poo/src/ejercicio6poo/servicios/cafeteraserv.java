/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6poo.servicios;

import ejercicio6poo.Cafetera;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class cafeteraserv {

    Scanner leer = new Scanner(System.in);
    Cafetera c1 = new Cafetera();

    public void llenarCafetera() {
        int x = 0;
        int cantactual;
        int cantmaxima;
        cantactual = x;
        cantmaxima = cantactual;

    }

    public void servirTaza() {

        System.out.println("ingrese tamaño de taza vacia");
        int tazavacia = leer.nextInt();
        c1.setTazavacia(tazavacia);
        System.out.println("cuanto le desea hechar a la taza");
        int cantidad = leer.nextInt();
        c1.setCantidad(cantidad);
        System.out.println("SIRVIENDO");
        System.out.println("---------------");
        if (cantidad < tazavacia) {
            System.out.println("La taza no se lleno");

        }

    }

    public void vaciarCafetera() {
        int cafeteravacia = 0;

    }

    public void agregarCafe() {
        System.out.println("INGRESE UNA CANTIDAD DE LITROS");
        int litros = leer.nextInt();
        c1.setLitros(litros);
        System.out.println("SIRVIENDO " + c1.getLitros() + "A LA CAFETERA");

    }
}
