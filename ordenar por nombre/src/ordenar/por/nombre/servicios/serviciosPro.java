/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar.por.nombre.servicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import ordenar.por.nombre.Productos;

/**
 *
 * @author pguid
 */
public class serviciosPro {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    ArrayList<Productos>ListaProductos= new ArrayList();
    Productos p1;
    public Productos cargarProductos(){
   
    String res;
    
    do{
         p1= new Productos();
        System.out.println("ingrese productos");
        p1.setProductosNombre(leer.next());
        System.out.println("ingrese el precio");
        p1.setPrecios(leer.nextDouble());
           ListaProductos.add(p1);
        System.out.println("desea ingresar otro producto? s/n");
        res= leer.next();
     
    }while(res.equalsIgnoreCase("s"));
    return p1;
}
    public void mostrar(){
        for (Productos aux : ListaProductos) {
            System.out.println(aux);
        }
    }
    public void mostrarOrden(){
        ListaProductos.sort(compararPrecio);
        mostrar();
    }
    public static Comparator<Productos> compararPrecio= new Comparator<Productos>(){
        public int compare(Productos p1,Productos p2){
            return p1.getPrecios().compareTo(p2.getPrecios());
        }
    };
    
}
