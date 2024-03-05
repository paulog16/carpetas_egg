/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1relaciones.servicios;

import ejercicio1relaciones.Perro;
import ejercicio1relaciones.Persona;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosPerro {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
     Perro perro1;
     Perro perro2;
     Persona p1;
Persona p2;
public void crearperro(){
    perro1= new Perro();
    perro2= new Perro();
    System.out.println("creando primer perro");
    System.out.println("nombre: ");
 perro1.setNombre(leer.next());
    System.out.println("raza: ");
   perro1.setRaza(leer.next());
    System.out.println("edad: ");
  perro1.setEdad(leer.nextInt());
    System.out.println("tamaño");
   perro1.setTamaño(leer.next());
   
    leer.nextLine();
    System.out.println("creando segundo perro");
        System.out.println("nombre: ");
    perro2.setNombre(leer.next());
    System.out.println("raza: ");
    perro2.setRaza(leer.next());
    System.out.println("edad: ");
    perro2.setEdad(leer.nextInt());
    System.out.println("tamaño");
    perro2.setTamaño(leer.next());
   
    leer.nextLine();
    
}

public void crearPersonas(){
    p1=new Persona();
    p2=new Persona();
    System.out.println("creando primera persona"); 
    System.out.println("nombre");
    p1.setNombre(leer.next());
    System.out.println("apellido:");
    p1.setApellido(leer.next());
    System.out.println("edad");
    p1.setEdad(leer.nextInt());
    System.out.println("documento");
    p1.setDocumento(leer.nextInt());

    leer.nextLine();
       System.out.println("creando segunda persona"); 
    System.out.println("nombre");
    p2.setNombre(leer.next());
    System.out.println("apellido:");
    p2.setApellido(leer.next());
    System.out.println("edad");
    p2.setEdad(leer.nextInt());
    System.out.println("documento");
    p2.setDocumento(leer.nextInt());

    
}
  public void asignacion(){
      p1.asignarPerro(perro1);
      p2.asignarPerro(perro2);
  }
public void mostrarInfoPerro1() {
        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Raza: " + perro1.getRaza());
        System.out.println("Edad: " + perro1.getEdad());
        System.out.println("Tamaño: " + perro1.getTamaño());
    }
public void mostrarInfoPerro2() {
        System.out.println("Nombre: " + perro2.getNombre());
        System.out.println("Raza: " + perro2.getRaza());
        System.out.println("Edad: " + perro2.getEdad());
        System.out.println("Tamaño: " + perro2.getTamaño());
    }

    public void mostrarInfoPersona1() {
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Documento: " + p1.getDocumento());
        System.out.println("Perro: ");
       mostrarInfoPerro1();
    }
       public void mostrarInfoPersona2() {
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Apellido: " + p2.getApellido());
        System.out.println("Edad: " + p2.getEdad());
        System.out.println("Documento: " + p2.getDocumento());
        System.out.println("Perro: ");
        mostrarInfoPerro2();
    }

}
