/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7poo.servicios;

import ejercicio7poo.persona;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class personaserv {

    Scanner leer = new Scanner(System.in);
    persona p1 = new persona();

    public void crearPersona() {
        System.out.println("INGRESE SU NOMBRE");
        String nombre = leer.next();
        p1.setNombre(nombre);
        System.out.println("INGRESE SU EDAD");
        int edad = leer.nextInt();
        p1.setEdad(edad);
        System.out.println("INGRESE ALTURA");
        double altura = leer.nextDouble();
        p1.setAltura(altura);
        System.out.println("INGRESE PESO");
        double peso = leer.nextDouble();
        p1.setPeso(peso);
        System.out.println("INGRESE SEXO");
        String sexo = leer.next();
        p1.setSexo(sexo);
        if (p1.getSexo() == "H" || p1.getSexo() == "M" || p1.getSexo() == "O") {
            System.out.println("INCORRECTO");
        } else {
            System.out.println("CORRECTO");
        }
    }

    public void calcularIMC() {
        double pesoideal;
        pesoideal = (p1.getPeso() / (p1.getAltura() * p1.getAltura()));
        if (pesoideal == 20) {
            System.out.println("-1");
        } else if (pesoideal >= 20 && pesoideal < 25) {
            System.out.println("0");

        } else {
            System.out.println("1");
        }
    }
    public void esMayordeEdad(){
        boolean edad;
        if(p1.getEdad()>=18){
            edad= true;
            System.out.println(""+edad);
        }else{
            edad=false;
            System.out.println(""+edad);
        }
    }
    persona p2= new persona();
     public void crearPersonaa() {
        System.out.println("INGRESE SU NOMBRE");
        String nombre = leer.next();
        p2.setNombre(nombre);
        System.out.println("INGRESE SU EDAD");
        int edad = leer.nextInt();
        p2.setEdad(edad);
        System.out.println("INGRESE ALTURA");
        double altura = leer.nextDouble();
        p2.setAltura(altura);
        System.out.println("INGRESE PESO");
        double peso = leer.nextDouble();
        p1.setPeso(peso);
        System.out.println("INGRESE SEXO");
        String sexo = leer.next();
        p2.setSexo(sexo);
        if (p2.getSexo() == "H" || p2.getSexo() == "M" || p2.getSexo() == "O") {
            System.out.println("INCORRECTO");
        } else {
            System.out.println("CORRECTO");
        }
    }

    public void caalcularIMC() {
        double pesoideal;
        pesoideal = (p2.getPeso() / (p2.getAltura() * p2.getAltura()));
        if (pesoideal == 20) {
            System.out.println("-1");
        } else if (pesoideal >= 20 && pesoideal < 25) {
            System.out.println("0");

        } else {
            System.out.println("1");
        }
    }
    public void esMaayordeEdad(){
        boolean edad;
        if(p2.getEdad()>=18){
            edad= true;
            System.out.println(""+edad);
        }else{
            edad=false;
            System.out.println(""+edad);
        }
    }
}
