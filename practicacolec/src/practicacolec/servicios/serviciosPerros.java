/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacolec.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import practicacolec.Perros;

/**
 *
 * @author pguid
 */
public class serviciosPerros {
    Scanner leer= new Scanner(System.in);
    ArrayList<Perros>ListaRaza= new ArrayList();
    public Perros crearPerro(){
        Perros obj = new Perros();
        System.out.println("ingrese nombre del perro");
        obj.setNombre(leer.next());
        System.out.println("ingrese raza del perro");
        obj.setRaza(leer.next());
        return obj;
    }
    public void fabricaPerros(){
        String res;
        do{
            ListaRaza.add(crearPerro());//llama al metodo crearPerro()
            System.out.println("desea ingresar otra raza? s/n");
            res=leer.next();
        }while(res.equalsIgnoreCase("s"));
    }
    public void mostrar(){
        for (Perros aux : ListaRaza) {
            System.out.println(aux);
        }
        System.out.println(ListaRaza.size());
    }
    public void eliminarPerro(){
    String res,aux,aux2;
    int cont=0;
    do{
        System.out.println("desea eliminiar un perro");
        res=leer.next();
        if(res.equalsIgnoreCase("s")){
            System.out.println("que perro desea eliminar");
            System.out.println("ingrese nombre");
            aux=leer.next();
            System.out.println("ingrese raza");
            aux2=leer.next();
            Iterator<Perros> pe= ListaRaza.iterator();
            while(pe.hasNext()){
                Perros var= pe.next();
if(var.getNombre().equals(aux)&& var.getRaza().equals(aux2)){
    pe.remove();
  
}else{
    System.out.println("no existe ese perro");
}
break;
            }
        }
    }while(!res.equals("n"));
   Collections.sort(ListaRaza,new Comparator<Perros>(){
       public int compare(Perros p1,Perros p2){
           return p1.getRaza().compareTo(p2.getRaza());
       }
   });
    
    ListaRaza.forEach((mostrar)->System.out.println(mostrar));
}
    public static void ordenarPorRaza(ArrayList<Perros>ListaRaza){
        //definimos un comparador
        Comparator<Perros>comparadorRaza= new Comparator<Perros>(){
         public int compare(Perros perro1,Perros perro2){
             return perro1.getRaza().compareTo(perro2.getRaza());
         }   
        };
        //ordenamos la lista utilizando el comparador
        Collections.sort(ListaRaza,comparadorRaza);
        System.out.println("lista completa:");
        ListaRaza.forEach((mostrar)->System.out.println(mostrar));
    }
}
