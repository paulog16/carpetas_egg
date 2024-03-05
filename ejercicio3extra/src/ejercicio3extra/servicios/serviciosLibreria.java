/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra.servicios;

import ejercicio3extra.Libreria;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosLibreria {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    HashSet<Libreria>ListaLibros= new HashSet();
    Libreria l1;
    public Libreria CargarLibros(){
    String res;
    do{
        l1=new Libreria();
        System.out.println("ingrese libros");
        System.out.println("titulo");
        l1.setTitulo(leer.next());
        System.out.println("autor");
       l1.setAutor(leer.next());
        System.out.println("numero de ejemplares");
        l1.setNumEjemplares(leer.nextInt());
        System.out.println("numeros de ejemplares prestados");
        l1.setNumPrestados(leer.nextInt());
        ListaLibros.add(l1);
        System.out.println("desea cargar otro libro?s/n");
        res=leer.next();
        
    }while(res.equalsIgnoreCase("s"));
    return l1;
    }
    public void mostrar(){
        for (Libreria ListaLibro : ListaLibros) {
            System.out.println(ListaLibro);
        }
    }
    public void prestamo(){
        String res;
    
        do{
        boolean encontrado=false;
        String prestado;
        System.out.println("ingrese libro que desea prestar");
        prestado=leer.next();
        for (Libreria aux : ListaLibros) {
            System.out.println(aux);
            if(prestado.equalsIgnoreCase(aux.getTitulo())){
                encontrado=true;
                if(aux.getNumEjemplares()>0){
                    aux.setNumPrestados(aux.getNumPrestados()+1);
                    aux.setNumEjemplares(aux.getNumEjemplares()-1);
                    System.out.println("libros que quedan: "+aux.getTitulo()+" : "+aux.getNumEjemplares());
                    System.out.println("cantidad prestados: "+aux.getTitulo()+" :"+ aux.getNumPrestados());
                }else{
                    System.out.println("no quedan mas libros para prestar");
                    encontrado=false;
                }
            }
        }
            System.out.println("desea prestar otro libreo?s/n");
            res=leer.next();
}while(res.equalsIgnoreCase("s"));
        }

    
    //Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
//busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método.
//El método se incrementa de a uno, como un carrito de compras, el atributo
//ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que
//se realice un préstamo del libro. No se podrán prestar libros de los que no queden
//ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
//operación y false en caso contrario
    public void devolucion(){
        String res;
    
        do{
        boolean encontrado=false;
        String devuelto;
        System.out.println("ingrese el libro que quieres devolver");
        devuelto=leer.next();
        for (Libreria aux : ListaLibros) {
            System.out.println(aux);
            if(devuelto.equalsIgnoreCase(aux.getTitulo())){
                encontrado=true;
                if(aux.getNumEjemplares()>0){
                    aux.setNumEjemplares(aux.getNumEjemplares()+1);
                aux.setNumPrestados(aux.getNumPrestados()-1);
                    System.out.println("libros que quedan: "+aux.getTitulo()+" : "+aux.getNumEjemplares());
                    System.out.println("libros prestados: "+aux.getTitulo()+" : "+aux.getNumPrestados());
                          
                }else{
                    encontrado=false;
                    System.out.println("no se encontro el libro");
                }
            }
        }
             System.out.println("desea devolver otro libro?s/n");
        res=leer.next();
    }while(res.equalsIgnoreCase("s"));
   
}
    //    Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
//busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
//método decrementa de a uno, como un carrito de compras, el atributo ejemplares
//prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
//produzca la devolución de un libro. No se podrán devolver libros donde que no
//tengan ejemplares prestados. Devuelve true si se ha podido realizar la operación y
//false en caso contrario
}
