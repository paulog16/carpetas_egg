/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14.servicios;

import ejercicio14.Movil;


import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class sermovil {
    Scanner leer= new Scanner(System.in);
    public Movil cargarMovil(){
        
        Movil m1= new Movil();
        System.out.println("ingrese marca: ");
        m1.setMarca(leer.next());
        System.out.println("ingrese precio: ");
        m1.setPrecio(leer.nextDouble());
        System.out.println("ingrese modelo:");
        m1.setModelo(leer.next());
        System.out.println("ingrese ram");
        m1.setRam(leer.nextInt());
        System.out.println("ingrese almacenamiento");
        m1.setAlmacenamiento(leer.nextInt());
        m1.setCodigo(cargarCodigo());
        return m1;
    }
    public static String[]cargarCodigo(){
        Scanner leer= new Scanner(System.in);
        String []codigo= new String [7];
        String codigoLargo;
        do{
            System.out.println("ingrese codigo de 7 digitos");
            codigoLargo= leer.next();
        } while (codigoLargo.length()!=7);
        for (int i = 0; i < 7; i++) {
            codigo[i]= codigoLargo.substring(i,i+1);
        }
        return codigo;
    }
}
