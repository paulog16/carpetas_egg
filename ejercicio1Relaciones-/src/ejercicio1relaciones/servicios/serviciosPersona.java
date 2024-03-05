/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1relaciones.servicios;

import ejercicio1relaciones.Perro;
import ejercicio1relaciones.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    serviciosPerro perro= new serviciosPerro();
   Perro c= new Perro();
    ArrayList<Persona>ListaPersonas= new ArrayList();
    Persona p;
    public Persona crearPersona(serviciosPerro perro){
        String res;
        do{
          
                
           
        p=new Persona();
        System.out.println("datos de la persona");
        System.out.println("ingrese nombre");
        p.setNombre(leer.next());
        System.out.println("apellido");
        p.setApellido(leer.next());
        System.out.println("edad");
        p.setEdad(leer.nextInt());
        System.out.println("documento");
        p.setDocumento(leer.nextInt());
        ListaPersonas.add(p);
        
      
      
    

        
        System.out.println("");
  
        System.out.println("Lista de perros para elegir:");
        System.out.println("");
        perro.mostrarPerros();
        String buscarPerro= leer.next();
        boolean encontrado=false;
   
    Iterator<Perro> it = perro.ListaPerros.iterator();

        while (it.hasNext()) {
            Perro c = it.next();
            if (c.getNombre().equalsIgnoreCase(buscarPerro)) {
                p.setPerro(c);
                encontrado = true;
                System.out.println("Perro encontrado, asignado a la persona y eliminado de la lista.");
                it.remove();
            }
        }
        if(encontrado==false){
            System.out.println("el perro no se encuentra en la lista");
        }
                mostrarPersona(p);
                
                
        System.out.println("desea crear otra persona?s/n");
        res=leer.next();
    }while(res.equalsIgnoreCase("s"));
        return p;
    }
    public void mostrarPersona(Persona p){
        System.out.println(p);
    }
}
