/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5collections.servicios;

import ejercicio5collections.ClasePaises;


import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author pguid
 */
public class servicios {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    TreeSet <ClasePaises> ListaPaises=new TreeSet();
    ClasePaises p1;
    public ClasePaises cargarPais(){
     
        String res;
        do{
               p1=new ClasePaises();
               System.out.println("ingrese un pais");
               p1.setPaises(leer.next());
               ListaPaises.add(p1);
               System.out.print("desea ingresar otro pais? s/n : ");
               res=leer.next();
        }while(res.equalsIgnoreCase("s"));
        return p1;
    }
//    public void mostrarPaises(){
//        for (ClasePaises aux : ListaPaises) {
//            System.out.println(aux);
//        }
//    }
    public void orden(){
        System.out.println("----------------");
        System.out.println("Paises ordenados alfabeticamente");
        for (ClasePaises ListaPaise : ListaPaises) {
            System.out.println(ListaPaise);
        }
//        mostrarPaises();
    }
//   public static Comparator<ClasePaises> OrdenarAlfa=new Comparator<ClasePaises>(){
//    public int compare(ClasePaises p1,ClasePaises p2){
//        return p1.getPaises().compareTo(p2.getPaises());
//    }
//};
    public void eliminar(){
        String aux,res;
        int cont=0;
    
        do{
              boolean encontrado=false;
            System.out.println("ingrese pais que quiere eliminar");
            aux=leer.next();
            System.out.println("quieres eliminar otro pais? s/n");
            res=leer.next();
                    Iterator<ClasePaises>it= ListaPaises.iterator();
                    while(it.hasNext()){
                        ClasePaises var1=it.next();
                        if(var1.getPaises().equals(aux)){
                            it.remove();
//                            mostrarPaises();
                            encontrado=true;
                            System.out.println("pais eliminado");
                         
                        }
                      
                           
                       
                    }
                    if(encontrado==false){
                        System.out.println("pais no encontrado");
                    }
        }while(res.equalsIgnoreCase("s"));
      ListaPaises.forEach((object) -> {
      System.out.println(object);
    
        });
    orden();
    }
    
}
//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.