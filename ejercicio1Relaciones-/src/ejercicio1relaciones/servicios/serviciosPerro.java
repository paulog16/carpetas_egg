/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1relaciones.servicios;

import ejercicio1relaciones.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosPerro {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> ListaPerros= new ArrayList();
    Perro perro;
   
    public void crearPerros(){
     String res;
        do{
        perro=new Perro();
         System.out.println("ingrese nombre del perro");
   perro.setNombre(leer.next());
         ListaPerros.add(perro);
            System.out.println("desea ingresar otro perro?s/n");
            res=leer.next();
     }while(res.equalsIgnoreCase("s"));
    }
    public void mostrarPerros(){
        ListaPerros.forEach(aux -> {
            System.out.println(aux);
        });
    }
}
