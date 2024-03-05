/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2collections.extra.servicios;

import ejercicio2collections.extra.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class servicios {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    ArrayList<CantanteFamoso>Lista= new ArrayList();
    CantanteFamoso c1;
    public void cargar(){
        for (int i = 0; i < 3; i++) {
            c1= new CantanteFamoso();
            System.out.println("ingrese nombre");
            c1.setNombre(leer.next());
            System.out.println("ingrese disco mas famoso");
            c1.setDiscoConMasVentas(leer.next());
            Lista.add(c1);
        }
  
    }
    public void mostrar(){
        Lista.forEach((aux) -> {
            System.out.println(aux);
        });
    }
    public void agregar(){
        String aux;
        boolean encontrado;
        String disco;
//        do{
            encontrado=false;
        System.out.println("ingrese otro cantante mas");
        aux=leer.next();
        
        
//        if(aux.equals(c1.getNombre())){
//            encontrado=true;
//            System.out.println("ese cantante ya existe");
//              continue;
//        }
            System.out.println("ingrese disco nuevo");
         disco=leer.next();
            Lista.add(new CantanteFamoso(aux,disco));
        
//        }while(encontrado);
        mostrar();
    }    
    public void eliminar(){
       String eliminar;
       String res;
       boolean encontrado=false;
       int cont=0;
       do{
           System.out.println("que cantante desea eliminar");
           eliminar=leer.next();
           Iterator<CantanteFamoso> it= Lista.iterator();
           while(it.hasNext()){
               CantanteFamoso var= it.next();
               if(var.getNombre().equals(eliminar)){
                  it.remove();
                   encontrado=true;
                  cont++;
                   System.out.println("artistas eliminados: "+cont);
               }
           }
           if(encontrado==false){
               System.out.println("no se encuentra el artista");
           }
           System.out.println("desea eliminar otro mas?s/n");
           res=leer.next();
       }while(res.equalsIgnoreCase("s"));
       mostrar();
    }
}
//Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
//tendrá como atributos el nombre y discoConMasVentas.
//Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
//objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
//cantante y su disco con más ventas por pantalla.
//Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
//agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
//usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
//cambios. 