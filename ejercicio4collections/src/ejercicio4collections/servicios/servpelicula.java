/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4collections.servicios;

import ejercicio4collections.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class servpelicula {
Scanner leer=new Scanner(System.in).useDelimiter("\n");
ArrayList <Pelicula> listaPelicula=new ArrayList();
  Pelicula p1;
public Pelicula crearPelicula(){
 
    String res;
    do{
        p1=new Pelicula();
        System.out.println("ingrese una peli");
       p1.setTitulo(leer.next());
        System.out.println("ingrese el director:");
        p1.setDirector(leer.next());
        System.out.println("ingrese duracion");
        p1.setHoras(leer.nextDouble());
     listaPelicula.add(p1);
        System.out.println("desea ingresar otra peli? s/n");
        res=leer.next();
    }while(res.equalsIgnoreCase("s"));
       
    return p1;
}
public void mostrar(){
    System.out.println("---PELICULAS---");
    for (Pelicula pelicula : listaPelicula) {
        
        System.out.println(pelicula);
    }
}
public void mayora1(){
      System.out.println("--PELICULAS CON MAS DE 1 HORA DE DURACION--");
    for (Pelicula pelicula : listaPelicula) {
        if(pelicula.getHoras()>1){
          
            System.out.println(pelicula);
        }
    }
}
public void ordenarCreciente(){
    System.out.println("------------------------------");
    System.out.println("--PELICULAS EN ORDEN CRECIENTE--");
    listaPelicula.sort(compararCreciente);
    mostrar();
}
public void ordenarDecreciente(){
    System.out.println("------------------------------");
    System.out.println("--PELICULAS EN DECRECIENTE--");
    listaPelicula.sort(compararDecreciente);
    mostrar();
}
public void compararTitulo(){
    System.out.println("----------------------------");
    System.out.println("--PELICULAS EN ORDEN SEGUN EL TITULO--");
    listaPelicula.sort(compararTitulo);
   mostrar();
}
public void compararDirector(){
    System.out.println("-------------------------");
    System.out.println("--PELICULAS EN ORDEN SEGUN EL DIRECTOR--");
    listaPelicula.sort(compararDirector);
    mostrar();
}
public static Comparator<Pelicula> compararCreciente= new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1,Pelicula p2){
return p1.getHoras().compareTo(p2.getHoras());
    }
   
};
public static Comparator<Pelicula> compararDecreciente= new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1,Pelicula p2){
return p2.getHoras().compareTo(p1.getHoras());
    }
   
};
public static Comparator<Pelicula> compararTitulo=new Comparator<Pelicula>(){
    public int compare(Pelicula p1,Pelicula p2){
        return p1.getTitulo().compareTo(p2.getTitulo());
    }
};
public static Comparator<Pelicula> compararDirector=new Comparator<Pelicula>(){
    public int compare(Pelicula p1,Pelicula p2){
        return p1.getDirector().compareTo(p2.getDirector());
    }
};
}
//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//
//22
//
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.